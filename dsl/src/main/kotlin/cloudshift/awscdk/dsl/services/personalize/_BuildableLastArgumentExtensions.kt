@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.personalize

import kotlin.Unit
import software.amazon.awscdk.services.personalize.CfnDataset
import software.amazon.awscdk.services.personalize.CfnSolution

/**
 * Describes a job that imports training data from a data source (Amazon S3 bucket) to an Amazon
 * Personalize dataset.
 */
public inline fun CfnDataset.setDatasetImportJob(
    block: CfnDatasetDatasetImportJobPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDatasetDatasetImportJobPropertyDsl()
    builder.apply(block)
    return setDatasetImportJob(builder.build())
}

/** Describes the configuration properties for the solution. */
public inline fun CfnSolution.setSolutionConfig(
    block: CfnSolutionSolutionConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnSolutionSolutionConfigPropertyDsl()
    builder.apply(block)
    return setSolutionConfig(builder.build())
}
