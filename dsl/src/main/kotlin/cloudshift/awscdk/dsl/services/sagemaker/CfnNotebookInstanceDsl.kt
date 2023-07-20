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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnNotebookInstance
import software.constructs.Construct
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnNotebookInstanceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnNotebookInstance.Builder = CfnNotebookInstance.Builder.create(
        scope,
        id,
    )

    private val _acceleratorTypes: MutableList<String> = mutableListOf()

    private val _additionalCodeRepositories: MutableList<String> = mutableListOf()

    private val _securityGroupIds: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun acceleratorTypes(vararg acceleratorTypes: String) {
        _acceleratorTypes.addAll(listOf(*acceleratorTypes))
    }

    public fun acceleratorTypes(acceleratorTypes: Collection<String>) {
        _acceleratorTypes.addAll(acceleratorTypes)
    }

    public fun additionalCodeRepositories(vararg additionalCodeRepositories: String) {
        _additionalCodeRepositories.addAll(listOf(*additionalCodeRepositories))
    }

    public fun additionalCodeRepositories(additionalCodeRepositories: Collection<String>) {
        _additionalCodeRepositories.addAll(additionalCodeRepositories)
    }

    public fun defaultCodeRepository(defaultCodeRepository: String) {
        cdkBuilder.defaultCodeRepository(defaultCodeRepository)
    }

    public fun directInternetAccess(directInternetAccess: String) {
        cdkBuilder.directInternetAccess(directInternetAccess)
    }

    public fun instanceMetadataServiceConfiguration(instanceMetadataServiceConfiguration: IResolvable) {
        cdkBuilder.instanceMetadataServiceConfiguration(instanceMetadataServiceConfiguration)
    }

    public fun instanceMetadataServiceConfiguration(instanceMetadataServiceConfiguration: CfnNotebookInstance.InstanceMetadataServiceConfigurationProperty) {
        cdkBuilder.instanceMetadataServiceConfiguration(instanceMetadataServiceConfiguration)
    }

    public fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
    }

    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    public fun lifecycleConfigName(lifecycleConfigName: String) {
        cdkBuilder.lifecycleConfigName(lifecycleConfigName)
    }

    public fun notebookInstanceName(notebookInstanceName: String) {
        cdkBuilder.notebookInstanceName(notebookInstanceName)
    }

    public fun platformIdentifier(platformIdentifier: String) {
        cdkBuilder.platformIdentifier(platformIdentifier)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun rootAccess(rootAccess: String) {
        cdkBuilder.rootAccess(rootAccess)
    }

    public fun securityGroupIds(vararg securityGroupIds: String) {
        _securityGroupIds.addAll(listOf(*securityGroupIds))
    }

    public fun securityGroupIds(securityGroupIds: Collection<String>) {
        _securityGroupIds.addAll(securityGroupIds)
    }

    public fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun volumeSizeInGb(volumeSizeInGb: Number) {
        cdkBuilder.volumeSizeInGb(volumeSizeInGb)
    }

    public fun build(): CfnNotebookInstance {
        if (_acceleratorTypes.isNotEmpty()) cdkBuilder.acceleratorTypes(_acceleratorTypes)
        if (_additionalCodeRepositories.isNotEmpty()) {
            cdkBuilder.additionalCodeRepositories(_additionalCodeRepositories)
        }
        if (_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
