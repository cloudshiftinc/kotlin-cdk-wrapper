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

package io.cloudshiftdev.awscdkdsl.services.mediatailor

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediatailor.CfnSourceLocation
import software.constructs.Construct

/**
 * A source location is a container for sources.
 *
 * For more information about source locations, see
 * [Working with source locations](https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-source-locations.html)
 * in the *MediaTailor User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediatailor.*;
 * CfnSourceLocation cfnSourceLocation = CfnSourceLocation.Builder.create(this,
 * "MyCfnSourceLocation")
 * .httpConfiguration(HttpConfigurationProperty.builder()
 * .baseUrl("baseUrl")
 * .build())
 * .sourceLocationName("sourceLocationName")
 * // the properties below are optional
 * .accessConfiguration(AccessConfigurationProperty.builder()
 * .accessType("accessType")
 * .secretsManagerAccessTokenConfiguration(SecretsManagerAccessTokenConfigurationProperty.builder()
 * .headerName("headerName")
 * .secretArn("secretArn")
 * .secretStringKey("secretStringKey")
 * .build())
 * .build())
 * .defaultSegmentDeliveryConfiguration(DefaultSegmentDeliveryConfigurationProperty.builder()
 * .baseUrl("baseUrl")
 * .build())
 * .segmentDeliveryConfigurations(List.of(SegmentDeliveryConfigurationProperty.builder()
 * .baseUrl("baseUrl")
 * .name("name")
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html)
 */
@CdkDslMarker
public class CfnSourceLocationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSourceLocation.Builder = CfnSourceLocation.Builder.create(scope, id)

    private val _segmentDeliveryConfigurations: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The access configuration for the source location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-accessconfiguration)
     *
     * @param accessConfiguration The access configuration for the source location.
     */
    public fun accessConfiguration(accessConfiguration: IResolvable) {
        cdkBuilder.accessConfiguration(accessConfiguration)
    }

    /**
     * The access configuration for the source location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-accessconfiguration)
     *
     * @param accessConfiguration The access configuration for the source location.
     */
    public fun accessConfiguration(
        accessConfiguration: CfnSourceLocation.AccessConfigurationProperty
    ) {
        cdkBuilder.accessConfiguration(accessConfiguration)
    }

    /**
     * The default segment delivery configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-defaultsegmentdeliveryconfiguration)
     *
     * @param defaultSegmentDeliveryConfiguration The default segment delivery configuration.
     */
    public fun defaultSegmentDeliveryConfiguration(
        defaultSegmentDeliveryConfiguration: IResolvable
    ) {
        cdkBuilder.defaultSegmentDeliveryConfiguration(defaultSegmentDeliveryConfiguration)
    }

    /**
     * The default segment delivery configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-defaultsegmentdeliveryconfiguration)
     *
     * @param defaultSegmentDeliveryConfiguration The default segment delivery configuration.
     */
    public fun defaultSegmentDeliveryConfiguration(
        defaultSegmentDeliveryConfiguration:
            CfnSourceLocation.DefaultSegmentDeliveryConfigurationProperty
    ) {
        cdkBuilder.defaultSegmentDeliveryConfiguration(defaultSegmentDeliveryConfiguration)
    }

    /**
     * The HTTP configuration for the source location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-httpconfiguration)
     *
     * @param httpConfiguration The HTTP configuration for the source location.
     */
    public fun httpConfiguration(httpConfiguration: IResolvable) {
        cdkBuilder.httpConfiguration(httpConfiguration)
    }

    /**
     * The HTTP configuration for the source location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-httpconfiguration)
     *
     * @param httpConfiguration The HTTP configuration for the source location.
     */
    public fun httpConfiguration(httpConfiguration: CfnSourceLocation.HttpConfigurationProperty) {
        cdkBuilder.httpConfiguration(httpConfiguration)
    }

    /**
     * The segment delivery configurations for the source location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-segmentdeliveryconfigurations)
     *
     * @param segmentDeliveryConfigurations The segment delivery configurations for the source
     *   location.
     */
    public fun segmentDeliveryConfigurations(vararg segmentDeliveryConfigurations: Any) {
        _segmentDeliveryConfigurations.addAll(listOf(*segmentDeliveryConfigurations))
    }

    /**
     * The segment delivery configurations for the source location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-segmentdeliveryconfigurations)
     *
     * @param segmentDeliveryConfigurations The segment delivery configurations for the source
     *   location.
     */
    public fun segmentDeliveryConfigurations(segmentDeliveryConfigurations: Collection<Any>) {
        _segmentDeliveryConfigurations.addAll(segmentDeliveryConfigurations)
    }

    /**
     * The segment delivery configurations for the source location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-segmentdeliveryconfigurations)
     *
     * @param segmentDeliveryConfigurations The segment delivery configurations for the source
     *   location.
     */
    public fun segmentDeliveryConfigurations(segmentDeliveryConfigurations: IResolvable) {
        cdkBuilder.segmentDeliveryConfigurations(segmentDeliveryConfigurations)
    }

    /**
     * The name of the source location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-sourcelocationname)
     *
     * @param sourceLocationName The name of the source location.
     */
    public fun sourceLocationName(sourceLocationName: String) {
        cdkBuilder.sourceLocationName(sourceLocationName)
    }

    /**
     * The tags assigned to the source location.
     *
     * Tags are key-value pairs that you can associate with Amazon resources to help with
     * organization, access control, and cost tracking. For more information, see
     * [Tagging AWS Elemental MediaTailor Resources](https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-tags)
     *
     * @param tags The tags assigned to the source location.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags assigned to the source location.
     *
     * Tags are key-value pairs that you can associate with Amazon resources to help with
     * organization, access control, and cost tracking. For more information, see
     * [Tagging AWS Elemental MediaTailor Resources](https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-tags)
     *
     * @param tags The tags assigned to the source location.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnSourceLocation {
        if (_segmentDeliveryConfigurations.isNotEmpty())
            cdkBuilder.segmentDeliveryConfigurations(_segmentDeliveryConfigurations)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
