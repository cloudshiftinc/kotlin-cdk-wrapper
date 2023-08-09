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

package cloudshift.awscdk.dsl.services.databrew

import kotlin.Unit
import software.amazon.awscdk.services.databrew.CfnDataset
import software.amazon.awscdk.services.databrew.CfnJob
import software.amazon.awscdk.services.databrew.CfnProject

/** A set of options that define how DataBrew interprets the data in the dataset. */
public inline fun CfnDataset.setFormatOptions(
    block: CfnDatasetFormatOptionsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDatasetFormatOptionsPropertyDsl()
    builder.apply(block)
    return setFormatOptions(builder.build())
}

/**
 * Information on how DataBrew can find the dataset, in either the AWS Glue Data Catalog or Amazon
 * S3 .
 */
public inline fun CfnDataset.setInput(block: CfnDatasetInputPropertyDsl.() -> Unit = {}) {
    val builder = CfnDatasetInputPropertyDsl()
    builder.apply(block)
    return setInput(builder.build())
}

/** A set of options that defines how DataBrew interprets an Amazon S3 path of the dataset. */
public inline fun CfnDataset.setPathOptions(
    block: CfnDatasetPathOptionsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDatasetPathOptionsPropertyDsl()
    builder.apply(block)
    return setPathOptions(builder.build())
}

/**
 * A sample configuration for profile jobs only, which determines the number of rows on which the
 * profile job is run.
 */
public inline fun CfnJob.setJobSample(block: CfnJobJobSamplePropertyDsl.() -> Unit = {}) {
    val builder = CfnJobJobSamplePropertyDsl()
    builder.apply(block)
    return setJobSample(builder.build())
}

/** Output location. */
public inline fun CfnJob.setOutputLocation(block: CfnJobOutputLocationPropertyDsl.() -> Unit = {}) {
    val builder = CfnJobOutputLocationPropertyDsl()
    builder.apply(block)
    return setOutputLocation(builder.build())
}

/** Configuration for profile jobs. */
public inline fun CfnJob.setProfileConfiguration(
    block: CfnJobProfileConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnJobProfileConfigurationPropertyDsl()
    builder.apply(block)
    return setProfileConfiguration(builder.build())
}

/** A series of data transformation steps that the job runs. */
public inline fun CfnJob.setRecipe(block: CfnJobRecipePropertyDsl.() -> Unit = {}) {
    val builder = CfnJobRecipePropertyDsl()
    builder.apply(block)
    return setRecipe(builder.build())
}

/** The sample size and sampling type to apply to the data. */
public inline fun CfnProject.setSample(block: CfnProjectSamplePropertyDsl.() -> Unit = {}) {
    val builder = CfnProjectSamplePropertyDsl()
    builder.apply(block)
    return setSample(builder.build())
}
