<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

  <xsl:template match="ies">
  
  
  
  <html lang="en">
<head>
    <title>Transformacion</title>
</head>
<body>
    <xsl:apply-templates select="ciclos"/>
</body>
</html>
  </xsl:template>
  
  <xsl:template match="ciclos">
   <ul>
    <xsl:apply-templates select="ciclo"/>
     </ul>
  </xsl:template>
  
  <xsl:template match="ciclo">
   
            <xsl:apply-templates></xsl:apply-templates>
   
    
  </xsl:template>
  
  <xsl:template match="ciclo">
      
      <xsl:if test="decretoTitulo/@año>2008">
             <li> <xsl:value-of select="nombre"></xsl:value-of></li>
             <li><xsl:value-of select="grado"></xsl:value-of></li> 
             <li><xsl:value-of select="decretoTitulo/@año"></xsl:value-of></li>
             <br></br>

      </xsl:if>
 
  </xsl:template>
  
</xsl:stylesheet>
