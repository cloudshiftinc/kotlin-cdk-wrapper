@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.accessanalyzer

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer
import software.amazon.awscdk.services.accessanalyzer.CfnAnalyzerProps
import software.constructs.Construct

public object accessanalyzer {
  public inline fun cfnAnalyzer(
    scope: Construct,
    id: String,
    block: CfnAnalyzerDsl.() -> Unit = {},
  ): CfnAnalyzer {
    val builder = CfnAnalyzerDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnalyzerArchiveRuleProperty(block: CfnAnalyzerArchiveRulePropertyDsl.() -> Unit = {}):
      CfnAnalyzer.ArchiveRuleProperty {
    val builder = CfnAnalyzerArchiveRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAnalyzerFilterProperty(block: CfnAnalyzerFilterPropertyDsl.() -> Unit = {}):
      CfnAnalyzer.FilterProperty {
    val builder = CfnAnalyzerFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAnalyzerProps(block: CfnAnalyzerPropsDsl.() -> Unit = {}): CfnAnalyzerProps {
    val builder = CfnAnalyzerPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
