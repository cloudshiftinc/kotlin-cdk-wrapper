@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

public enum class ParserProcessorType(
  private val cdkObject: software.amazon.awscdk.services.logs.ParserProcessorType,
) {
  JSON(software.amazon.awscdk.services.logs.ParserProcessorType.JSON),
  KEY_VALUE(software.amazon.awscdk.services.logs.ParserProcessorType.KEY_VALUE),
  CSV(software.amazon.awscdk.services.logs.ParserProcessorType.CSV),
  GROK(software.amazon.awscdk.services.logs.ParserProcessorType.GROK),
  OCSF(software.amazon.awscdk.services.logs.ParserProcessorType.OCSF),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.ParserProcessorType):
        ParserProcessorType = when (cdkObject) {
      software.amazon.awscdk.services.logs.ParserProcessorType.JSON -> ParserProcessorType.JSON
      software.amazon.awscdk.services.logs.ParserProcessorType.KEY_VALUE ->
          ParserProcessorType.KEY_VALUE
      software.amazon.awscdk.services.logs.ParserProcessorType.CSV -> ParserProcessorType.CSV
      software.amazon.awscdk.services.logs.ParserProcessorType.GROK -> ParserProcessorType.GROK
      software.amazon.awscdk.services.logs.ParserProcessorType.OCSF -> ParserProcessorType.OCSF
    }

    internal fun unwrap(wrapped: ParserProcessorType):
        software.amazon.awscdk.services.logs.ParserProcessorType = wrapped.cdkObject
  }
}
