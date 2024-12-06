package me.mchiappinam.pdghajuda;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Comando implements CommandExecutor {
  //private Main plugin;

	public Comando(Main main) {
		//plugin = main;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] args) {
		if (cmd.getName().equalsIgnoreCase("comandos")) {
			help((Player)sender);
			return true;
		}else if (cmd.getName().equalsIgnoreCase("ajuda")) {
			if ((args.length==0) || (args.length >1)) {
				help((Player)sender);
				return true;
			}
			if(args[0].equalsIgnoreCase("denuncias")) {
				denuncias((Player)sender);
				return true;
			}else if(args[0].equalsIgnoreCase("eventos")) {
				eventos((Player)sender);
				return true;
			}else if(args[0].equalsIgnoreCase("forum")) {
				forum((Player)sender);
				return true;
			}else if(args[0].equalsIgnoreCase("minecraft")) {
				minecraft((Player)sender);
				return true;
			}else if(args[0].equalsIgnoreCase("regras")) {
				regras((Player)sender);
				return true;
			}else if(args[0].equalsIgnoreCase("servidores")) {
				servidores((Player)sender);
				return true;
			}else if(args[0].equalsIgnoreCase("site")) {
				site((Player)sender);
				return true;
			}else if(args[0].equalsIgnoreCase("teamspeak")) {
				teamspeak((Player)sender);
				return true;
			}else if(args[0].equalsIgnoreCase("textura")) {
				textura((Player)sender);
				return true;
			}
		}
		return true;
	}
	
	public void help(Player p) {
		p.sendMessage("§3§lPDGH Ajuda - Ajuda para iniciantes:");
		p.sendMessage("§2/ajuda denuncias -§a- Como denunciar.");
		p.sendMessage("§2/ajuda eventos -§a- Eventos automáticos PDGH.");
		p.sendMessage("§2/ajuda forum -§a- Fórum PDGH.");
		p.sendMessage("§2/ajuda minecraft -§a- ModPacks PDGH.");
		p.sendMessage("§2/ajuda regras -§a- §lRegras PDGH§a.");
		p.sendMessage("§2/ajuda servidores -§a- Servidores PDGH.");
		p.sendMessage("§2/ajuda site -§a- Site PDGH.");
		p.sendMessage("§2/ajuda teamspeak -§a- TeamSpeak 3 PDGH.");
		p.sendMessage("§2/ajuda textura -§a- Texturas PDGH.");
	}
	
	public void denuncias(Player p) {
		p.sendMessage("§3§lPDGH Ajuda - Ajuda para iniciantes:");
		p.sendMessage("§c"+ChatColor.BOLD+"➪§9Olá! Sou o Dollynho, seu amiguinho, e vou te ajudar!");
		p.sendMessage("§c"+ChatColor.BOLD+"➪§9Todas as denúncias são feitas apenas em nosso fórum.");
		p.sendMessage("§c"+ChatColor.BOLD+"➪§9Ainda não conhece nosso fórum? Digite §a§l/ajuda forum");
		p.sendMessage("§c"+ChatColor.BOLD+"➪§9Vale a pena denunciar! Corra, vai que algum dia caia um meteoro do céu e faça o jogador não ser punido?");
		p.sendMessage("§c"+ChatColor.BOLD+"➪§9Mais alguma ajuda? Se sim, digite §a§l/ajuda");
	}
	
	public void eventos(Player p) {
		p.sendMessage("§3§lPDGH Ajuda - Ajuda para iniciantes:");
		p.sendMessage("§c"+ChatColor.BOLD+"➪§9Olá! Sou o Dollynho, seu amiguinho, e vou te ajudar!");
		p.sendMessage("§c"+ChatColor.BOLD+"➪§9Todas os tutoriais de evento estão em nosso fórum.");
		p.sendMessage("§c"+ChatColor.BOLD+"➪§9Veja como funciona os eventos §a§lwww.pdgh.com.br/eventos");
		p.sendMessage("§c"+ChatColor.BOLD+"➪§9Vale a pena conferir! Corra, vai que algum dia caia um meteoro do céu e faça nosso fórum não funcionar mais?");
		p.sendMessage("§c"+ChatColor.BOLD+"➪§9Mais alguma ajuda? Se sim, digite §a§l/ajuda");
	}
	
	public void forum(Player p) {
		p.sendMessage("§3§lPDGH Ajuda - Ajuda para iniciantes:");
		p.sendMessage("§c"+ChatColor.BOLD+"➪§9Olá! Sou o Dollynho, seu amiguinho, e vou te ajudar!");
		p.sendMessage("§c"+ChatColor.BOLD+"➪§9O nosso fórum é §a§lwww.pdgh.com.br/forum");
		p.sendMessage("§c"+ChatColor.BOLD+"➪§9Em nosso fórum é possível criar tópicos, postar respostas a tópicos já existentes, ver a reputação de seus companheiros, começar suas próprias mensagens privadas, atualizações de status, gerenciar seu perfil e muito mais!");
		p.sendMessage("§c"+ChatColor.BOLD+"➪§9Vale a pena conferir! Corra, vai que algum dia caia um meteoro do céu e faça nosso fórum não funcionar mais?");
		p.sendMessage("§c"+ChatColor.BOLD+"➪§9Mais alguma ajuda? Se sim, digite §a§l/ajuda");
	}
	
	public void minecraft(Player p) {
		p.sendMessage("§3§lPDGH Ajuda - Ajuda para iniciantes:");
		p.sendMessage("§c"+ChatColor.BOLD+"➪§9Olá! Sou o Dollynho, seu amiguinho, e vou te ajudar!");
		p.sendMessage("§c"+ChatColor.BOLD+"➪§9Se você entrar no site §a§lwww.pdgh.com.br/minecraft §9você encontra os nossos ModPacks.");
		p.sendMessage("§c"+ChatColor.BOLD+"➪§9Todos eles são configurados de uma das melhores formas possíveis para ficar sem lag no Minecraft.");
		p.sendMessage("§c"+ChatColor.BOLD+"➪§9Vale a pena experimentar! Corra, vai que algum dia caia um meteoro do céu e faça nosso site não funcionar mais?");
		p.sendMessage("§c"+ChatColor.BOLD+"➪§9Eu já tenho o meu! Mais alguma ajuda? Se sim, digite §a§l/ajuda");
	}
	
	public void regras(Player p) {
		p.sendMessage("§3§lPDGH Ajuda - Ajuda para iniciantes:");
		p.sendMessage("§c"+ChatColor.BOLD+"➪§9Olá! Sou o Dollynho, seu amiguinho, e vou te ajudar!");
		p.sendMessage("§c"+ChatColor.BOLD+"➪§9§lATENÇÃO§9: Sempre que você acessa nossos servidores, fórum e até mesmo nosso TeamSpeak, você aceita as regras abaixo e afirma que você está ciente que sua conta pode ser §lbloqueada sem aviso prévio §9caso desrespeitar e/ou ignorar uma das regras aqui citadas. A Equipe PDGH também se reserva o direito de alterar qualquer regra descrita abaixo §lsem nenhum aviso prévio");
		p.sendMessage("§c"+ChatColor.BOLD+"➪§9Todas nossas regras estão citadas em §a§lwww.pdgh.com.br/regras");
		p.sendMessage("§c"+ChatColor.BOLD+"➪§9Vale a pena denunciar! Corra, vai que algum dia caia um meteoro do céu e faça o jogador não ser punido?");
		p.sendMessage("§c"+ChatColor.BOLD+"➪§9Mais alguma ajuda? Se sim, digite §a§l/ajuda");
	}
	
	public void servidores(Player p) {
		p.sendMessage("§3§lPDGH Ajuda - Ajuda para iniciantes:");
		p.sendMessage("§c"+ChatColor.BOLD+"➪§9Olá! Sou o Dollynho, seu amiguinho, e vou te ajudar!");
		p.sendMessage("§c"+ChatColor.BOLD+"➪§9Temos diversos servidores! Infelizmente não vou informá-los.");
		p.sendMessage("§c"+ChatColor.BOLD+"➪§9Logo no início de nosso site você encontra TODOS os nossos servidores da PDGH.");
		p.sendMessage("§c"+ChatColor.BOLD+"➪§9Ainda não conhece nosso site? Digite §a§l/ajuda site");
		p.sendMessage("§c"+ChatColor.BOLD+"➪§9Vale a pena conferir! Corra, vai que algum dia caia um meteoro do céu e faça nosso site não funcionar mais?");
		p.sendMessage("§c"+ChatColor.BOLD+"➪§9Mais alguma ajuda? Se sim, digite §a§l/ajuda");
	}
	
	public void site(Player p) {
		p.sendMessage("§3§lPDGH Ajuda - Ajuda para iniciantes:");
		p.sendMessage("§c"+ChatColor.BOLD+"➪§9Olá! Sou o Dollynho, seu amiguinho, e vou te ajudar!");
		p.sendMessage("§c"+ChatColor.BOLD+"➪§9O nosso site é §a§lwww.pdgh.com.br");
		p.sendMessage("§c"+ChatColor.BOLD+"➪§9Em nosso site é possível ver todas as vantagens VIP, aprender a baixar nosso Minecraft e muito mais!");
		p.sendMessage("§c"+ChatColor.BOLD+"➪§9Vale a pena conferir! Corra, vai que algum dia caia um meteoro do céu e faça nosso site não funcionar mais?");
		p.sendMessage("§c"+ChatColor.BOLD+"➪§9Mais alguma ajuda? Se sim, digite §a§l/ajuda");
	}
	
	public void teamspeak(Player p) {
		p.sendMessage("§3§lPDGH Ajuda - Ajuda para iniciantes:");
		p.sendMessage("§c"+ChatColor.BOLD+"➪§9Olá! Sou o Dollynho, seu amiguinho, e vou te ajudar!");
		p.sendMessage("§c"+ChatColor.BOLD+"➪§9O nosso TeamSpeak 3 é §a§lts.pdgh.com.br");
		p.sendMessage("§c"+ChatColor.BOLD+"➪§9Não sabe onde baixar? Não sabe como se conectar? Veja: §a§lhttp://pdgh.com.br/teamspeak");
		p.sendMessage("§c"+ChatColor.BOLD+"➪§9Vale a pena se divertir! Corra, vai que algum dia caia um meteoro do céu e faça nosso TeamSpeak não funcionar mais?");
		p.sendMessage("§c"+ChatColor.BOLD+"➪§9Mais alguma ajuda? Se sim, digite §a§l/ajuda");
	}
	
	public void textura(Player p) {
		p.sendMessage("§3§lPDGH Ajuda - Ajuda para iniciantes:");
		p.sendMessage("§c"+ChatColor.BOLD+"➪§9Olá! Sou o Dollynho, seu amiguinho, e vou te ajudar!");
		p.sendMessage("§c"+ChatColor.BOLD+"➪§9Se você entrar no site §a§lwww.pdgh.com.br/textura §9você encontra as nossas texturas para o jogo.");
		p.sendMessage("§c"+ChatColor.BOLD+"➪§9Elas são feitas em alta definição e por incrível que pareça foram criadas para aumentar sua jogabilidade e seu FPS, causando menos lag.");
		p.sendMessage("§c"+ChatColor.BOLD+"➪§9Vale a pena experimentar! Corra, vai que algum dia caia um meteoro do céu e faça nosso site não funcionar mais?");
		p.sendMessage("§c"+ChatColor.BOLD+"➪§9Eu já tenho as minhas! Mais alguma ajuda? Se sim, digite §a§l/ajuda");
	}
}