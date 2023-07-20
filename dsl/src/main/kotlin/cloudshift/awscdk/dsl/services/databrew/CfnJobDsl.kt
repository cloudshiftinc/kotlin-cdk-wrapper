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

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnJob
import software.constructs.Construct
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnJobDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnJob.Builder = CfnJob.Builder.create(scope, id)

    private val _dataCatalogOutputs: MutableList<Any> = mutableListOf()

    private val _databaseOutputs: MutableList<Any> = mutableListOf()

    private val _outputs: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _validationConfigurations: MutableList<Any> = mutableListOf()

    public fun dataCatalogOutputs(vararg dataCatalogOutputs: Any) {
        _dataCatalogOutputs.addAll(listOf(*dataCatalogOutputs))
    }

    public fun dataCatalogOutputs(dataCatalogOutputs: Collection<Any>) {
        _dataCatalogOutputs.addAll(dataCatalogOutputs)
    }

    public fun dataCatalogOutputs(dataCatalogOutputs: IResolvable) {
        cdkBuilder.dataCatalogOutputs(dataCatalogOutputs)
    }

    public fun databaseOutputs(vararg databaseOutputs: Any) {
        _databaseOutputs.addAll(listOf(*databaseOutputs))
    }

    public fun databaseOutputs(databaseOutputs: Collection<Any>) {
        _databaseOutputs.addAll(databaseOutputs)
    }

    public fun databaseOutputs(databaseOutputs: IResolvable) {
        cdkBuilder.databaseOutputs(databaseOutputs)
    }

    public fun datasetName(datasetName: String) {
        cdkBuilder.datasetName(datasetName)
    }

    public fun encryptionKeyArn(encryptionKeyArn: String) {
        cdkBuilder.encryptionKeyArn(encryptionKeyArn)
    }

    public fun encryptionMode(encryptionMode: String) {
        cdkBuilder.encryptionMode(encryptionMode)
    }

    public fun jobSample(jobSample: IResolvable) {
        cdkBuilder.jobSample(jobSample)
    }

    public fun jobSample(jobSample: CfnJob.JobSampleProperty) {
        cdkBuilder.jobSample(jobSample)
    }

    public fun logSubscription(logSubscription: String) {
        cdkBuilder.logSubscription(logSubscription)
    }

    public fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
    }

    public fun maxRetries(maxRetries: Number) {
        cdkBuilder.maxRetries(maxRetries)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun outputLocation(outputLocation: IResolvable) {
        cdkBuilder.outputLocation(outputLocation)
    }

    public fun outputLocation(outputLocation: CfnJob.OutputLocationProperty) {
        cdkBuilder.outputLocation(outputLocation)
    }

    public fun outputs(vararg outputs: Any) {
        _outputs.addAll(listOf(*outputs))
    }

    public fun outputs(outputs: Collection<Any>) {
        _outputs.addAll(outputs)
    }

    public fun outputs(outputs: IResolvable) {
        cdkBuilder.outputs(outputs)
    }

    public fun profileConfiguration(profileConfiguration: IResolvable) {
        cdkBuilder.profileConfiguration(profileConfiguration)
    }

    public fun profileConfiguration(profileConfiguration: CfnJob.ProfileConfigurationProperty) {
        cdkBuilder.profileConfiguration(profileConfiguration)
    }

    public fun projectName(projectName: String) {
        cdkBuilder.projectName(projectName)
    }

    public fun recipe(recipe: IResolvable) {
        cdkBuilder.recipe(recipe)
    }

    public fun recipe(recipe: CfnJob.RecipeProperty) {
        cdkBuilder.recipe(recipe)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun timeout(timeout: Number) {
        cdkBuilder.timeout(timeout)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun validationConfigurations(vararg validationConfigurations: Any) {
        _validationConfigurations.addAll(listOf(*validationConfigurations))
    }

    public fun validationConfigurations(validationConfigurations: Collection<Any>) {
        _validationConfigurations.addAll(validationConfigurations)
    }

    public fun validationConfigurations(validationConfigurations: IResolvable) {
        cdkBuilder.validationConfigurations(validationConfigurations)
    }

    public fun build(): CfnJob {
        if (_dataCatalogOutputs.isNotEmpty()) cdkBuilder.dataCatalogOutputs(_dataCatalogOutputs)
        if (_databaseOutputs.isNotEmpty()) cdkBuilder.databaseOutputs(_databaseOutputs)
        if (_outputs.isNotEmpty()) cdkBuilder.outputs(_outputs)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_validationConfigurations.isNotEmpty()) {
            cdkBuilder.validationConfigurations(_validationConfigurations)
        }
        return cdkBuilder.build()
    }
}
