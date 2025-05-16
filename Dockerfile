FROM payara/server-full:latest

# Copie du WAR dans le dossier de déploiement automatique de Payara
COPY target/jakartaee-mysql-1.0.war $DEPLOY_DIR/jakartaee-mysql.war
