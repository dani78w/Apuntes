﻿<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
                  <xsl:template match="ciclos">
                                <html lang="en">
                                <body>
                                              <xsl:apply-templates select="ciclos" />
                                </body>
                                </html>
                  </xsl:template>
                  
                  <xsl:template match="ciclo">
                        <xsl:value-of select="nombre"/>
                  </xsl:template>
                  
</xsl:stylesheet>