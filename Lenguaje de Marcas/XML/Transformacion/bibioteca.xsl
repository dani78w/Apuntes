<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
                  <xsl:template match="biblioteca">
                  <html lang="en">
                                <body>
                                                    <xsl:apply-templates select="libro"/>
                                </body>
                                </html>
                  </xsl:template>
                  
                   <xsl:template match="libro">
                             <p><xsl:value-of select="autor"/> escribió <xsl:value-of select="titulo"/></p>
                  </xsl:template>
</xsl:stylesheet>