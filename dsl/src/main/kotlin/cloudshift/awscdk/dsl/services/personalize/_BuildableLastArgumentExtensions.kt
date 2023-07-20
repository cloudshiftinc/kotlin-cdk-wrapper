@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.personalize

import kotlin.Unit
import software.amazon.awscdk.services.personalize.CfnDataset
import software.amazon.awscdk.services.personalize.CfnSolution

public inline
    fun CfnDataset.setDatasetImportJob(block: CfnDatasetDatasetImportJobPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnDatasetDatasetImportJobPropertyDsl()
  builder.apply(block)
  return setDatasetImportJob(builder.build())
}

public inline
    fun CfnSolution.setSolutionConfig(block: CfnSolutionSolutionConfigPropertyDsl.() -> Unit = {}) {
  val builder = CfnSolutionSolutionConfigPropertyDsl()
  builder.apply(block)
  return setSolutionConfig(builder.build())
}
