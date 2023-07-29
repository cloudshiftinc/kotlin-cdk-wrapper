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

package cloudshift.awscdk.dsl.services.finspace

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.finspace.CfnEnvironment
import software.constructs.Construct

/**
 * The `AWS::FinSpace::Environment` resource represents an Amazon FinSpace environment.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.finspace.*;
 * CfnEnvironment cfnEnvironment = CfnEnvironment.Builder.create(this, "MyCfnEnvironment")
 * .name("name")
 * // the properties below are optional
 * .dataBundles(List.of("dataBundles"))
 * .description("description")
 * .federationMode("federationMode")
 * .federationParameters(FederationParametersProperty.builder()
 * .applicationCallBackUrl("applicationCallBackUrl")
 * .attributeMap(List.of(AttributeMapItemsProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .federationProviderName("federationProviderName")
 * .federationUrn("federationUrn")
 * .samlMetadataDocument("samlMetadataDocument")
 * .samlMetadataUrl("samlMetadataUrl")
 * .build())
 * .kmsKeyId("kmsKeyId")
 * .superuserParameters(SuperuserParametersProperty.builder()
 * .emailAddress("emailAddress")
 * .firstName("firstName")
 * .lastName("lastName")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html)
 */
@CdkDslMarker
public class CfnEnvironmentDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnEnvironment.Builder = CfnEnvironment.Builder.create(scope, id)

    private val _dataBundles: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * (deprecated) ARNs of FinSpace Data Bundles to install.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-databundles)
     *
     * @param dataBundles ARNs of FinSpace Data Bundles to install.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    public fun dataBundles(vararg dataBundles: String) {
        _dataBundles.addAll(listOf(*dataBundles))
    }

    /**
     * (deprecated) ARNs of FinSpace Data Bundles to install.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-databundles)
     *
     * @param dataBundles ARNs of FinSpace Data Bundles to install.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    public fun dataBundles(dataBundles: Collection<String>) {
        _dataBundles.addAll(dataBundles)
    }

    /**
     * The description of the FinSpace environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-description)
     *
     * @param description The description of the FinSpace environment.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The authentication mode for the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-federationmode)
     *
     * @param federationMode The authentication mode for the environment.
     */
    public fun federationMode(federationMode: String) {
        cdkBuilder.federationMode(federationMode)
    }

    /**
     * Configuration information when authentication mode is FEDERATED.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-federationparameters)
     *
     * @param federationParameters Configuration information when authentication mode is FEDERATED.
     */
    public fun federationParameters(federationParameters: IResolvable) {
        cdkBuilder.federationParameters(federationParameters)
    }

    /**
     * Configuration information when authentication mode is FEDERATED.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-federationparameters)
     *
     * @param federationParameters Configuration information when authentication mode is FEDERATED.
     */
    public fun federationParameters(
        federationParameters: CfnEnvironment.FederationParametersProperty
    ) {
        cdkBuilder.federationParameters(federationParameters)
    }

    /**
     * The KMS key id used to encrypt in the FinSpace environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-kmskeyid)
     *
     * @param kmsKeyId The KMS key id used to encrypt in the FinSpace environment.
     */
    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * The name of the FinSpace environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-name)
     *
     * @param name The name of the FinSpace environment.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * Configuration information for the superuser.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-superuserparameters)
     *
     * @param superuserParameters Configuration information for the superuser.
     */
    public fun superuserParameters(superuserParameters: IResolvable) {
        cdkBuilder.superuserParameters(superuserParameters)
    }

    /**
     * Configuration information for the superuser.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-superuserparameters)
     *
     * @param superuserParameters Configuration information for the superuser.
     */
    public fun superuserParameters(
        superuserParameters: CfnEnvironment.SuperuserParametersProperty
    ) {
        cdkBuilder.superuserParameters(superuserParameters)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-finspace-environment.html#cfn-finspace-environment-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnEnvironment {
        if (_dataBundles.isNotEmpty()) cdkBuilder.dataBundles(_dataBundles)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
