package de.patrick15a.tokenAPI.example;

import org.bukkit.entity.Player;

public class Token {
	
	// Gibt zurück wie viele Tokens der Spieler hat.
	public int get(Player p) {
		return Main.getTokenAPI().getToken(p);
	}
	
	// Fügt dem Spieler Tokens hinzu. Gibt zurück ob Funktion erfolgreich ausgeführt wurde.
	public boolean add(Player p, int tokens) {
		return Main.getTokenAPI().addToken(p, tokens);
	}
	
	// Entfernt dem Spieler Tokens. Gibt zurück ob Funktion erfolgreich ausgeführt wurde.
	public boolean remove(Player p, int tokens) {
		return Main.getTokenAPI().removeToken(p, tokens);
	}
	
	// Setzt dem Spieler Tokens. Gibt zurück ob Funktion erfolgreich ausgeführt wurde.
	public boolean set(Player p, int tokens) {
		return Main.getTokenAPI().setToken(p, tokens);
	}
	
	// Gibt zurück ob der Spieler x Tokens hat.
	public boolean has(Player p, int tokens) {
		return Main.getTokenAPI().hasToken(p, tokens);
	}
	
}
