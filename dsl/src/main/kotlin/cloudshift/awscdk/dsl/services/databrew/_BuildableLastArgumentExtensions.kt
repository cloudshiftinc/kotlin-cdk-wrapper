@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.databrew

import software.amazon.awscdk.services.databrew.CfnDataset
import software.amazon.awscdk.services.databrew.CfnJob
import software.amazon.awscdk.services.databrew.CfnProject
import kotlin.Unit

public inline fun CfnProject.setSample(block: CfnProjectSamplePropertyDsl.() -> Unit = {}) {
    val builder = CfnProjectSamplePropertyDsl()
    builder.apply(block)
    return setSample(builder.build())
}

public inline fun CfnDataset.setInput(block: CfnDatasetInputPropertyDsl.() -> Unit = {}) {
    val builder = CfnDatasetInputPropertyDsl()
    builder.apply(block)
    return setInput(builder.build())
}

public inline fun CfnDataset.setFormatOptions(
    block: CfnDatasetFormatOptionsPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnDatasetFormatOptionsPropertyDsl()
    builder.apply(block)
    return setFormatOptions(builder.build())
}

public inline fun CfnDataset.setPathOptions(
    block: CfnDatasetPathOptionsPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnDatasetPathOptionsPropertyDsl()
    builder.apply(block)
    return setPathOptions(builder.build())
}

public inline fun CfnJob.setJobSample(block: CfnJobJobSamplePropertyDsl.() -> Unit = {}) {
    val builder = CfnJobJobSamplePropertyDsl()
    builder.apply(block)
    return setJobSample(builder.build())
}

public inline fun CfnJob.setOutputLocation(block: CfnJobOutputLocationPropertyDsl.() -> Unit = {}) {
    val builder = CfnJobOutputLocationPropertyDsl()
    builder.apply(block)
    return setOutputLocation(builder.build())
}

public inline fun CfnJob.setProfileConfiguration(
    block: CfnJobProfileConfigurationPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnJobProfileConfigurationPropertyDsl()
    builder.apply(block)
    return setProfileConfiguration(builder.build())
}

public inline fun CfnJob.setRecipe(block: CfnJobRecipePropertyDsl.() -> Unit = {}) {
    val builder = CfnJobRecipePropertyDsl()
    builder.apply(block)
    return setRecipe(builder.build())
}
