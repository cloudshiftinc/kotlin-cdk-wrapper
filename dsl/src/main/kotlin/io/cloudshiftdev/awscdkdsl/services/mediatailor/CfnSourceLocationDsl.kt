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
 * Definition of AWS::MediaTailor::SourceLocation Resource Type.
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
     * Access configuration parameters.</p>.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-accessconfiguration)
     *
     * @param accessConfiguration Access configuration parameters.</p>.
     */
    public fun accessConfiguration(accessConfiguration: IResolvable) {
        cdkBuilder.accessConfiguration(accessConfiguration)
    }

    /**
     * Access configuration parameters.</p>.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-accessconfiguration)
     *
     * @param accessConfiguration Access configuration parameters.</p>.
     */
    public fun accessConfiguration(
        accessConfiguration: CfnSourceLocation.AccessConfigurationProperty
    ) {
        cdkBuilder.accessConfiguration(accessConfiguration)
    }

    /**
     * The optional configuration for a server that serves segments.
     *
     * Use this if you want the segment delivery server to be different from the source location
     * server. For example, you can configure your source location server to be an origination
     * server, such as MediaPackage, and the segment delivery server to be a content delivery
     * network (CDN), such as CloudFront. If you don't specify a segment delivery server, then the
     * source location server is used.</p>
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-defaultsegmentdeliveryconfiguration)
     *
     * @param defaultSegmentDeliveryConfiguration The optional configuration for a server that
     *   serves segments.
     */
    public fun defaultSegmentDeliveryConfiguration(
        defaultSegmentDeliveryConfiguration: IResolvable
    ) {
        cdkBuilder.defaultSegmentDeliveryConfiguration(defaultSegmentDeliveryConfiguration)
    }

    /**
     * The optional configuration for a server that serves segments.
     *
     * Use this if you want the segment delivery server to be different from the source location
     * server. For example, you can configure your source location server to be an origination
     * server, such as MediaPackage, and the segment delivery server to be a content delivery
     * network (CDN), such as CloudFront. If you don't specify a segment delivery server, then the
     * source location server is used.</p>
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-defaultsegmentdeliveryconfiguration)
     *
     * @param defaultSegmentDeliveryConfiguration The optional configuration for a server that
     *   serves segments.
     */
    public fun defaultSegmentDeliveryConfiguration(
        defaultSegmentDeliveryConfiguration:
            CfnSourceLocation.DefaultSegmentDeliveryConfigurationProperty
    ) {
        cdkBuilder.defaultSegmentDeliveryConfiguration(defaultSegmentDeliveryConfiguration)
    }

    /**
     * The HTTP configuration for the source location.</p>.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-httpconfiguration)
     *
     * @param httpConfiguration The HTTP configuration for the source location.</p>.
     */
    public fun httpConfiguration(httpConfiguration: IResolvable) {
        cdkBuilder.httpConfiguration(httpConfiguration)
    }

    /**
     * The HTTP configuration for the source location.</p>.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-httpconfiguration)
     *
     * @param httpConfiguration The HTTP configuration for the source location.</p>.
     */
    public fun httpConfiguration(httpConfiguration: CfnSourceLocation.HttpConfigurationProperty) {
        cdkBuilder.httpConfiguration(httpConfiguration)
    }

    /**
     * A list of the segment delivery configurations associated with this resource.</p>.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-segmentdeliveryconfigurations)
     *
     * @param segmentDeliveryConfigurations A list of the segment delivery configurations associated
     *   with this resource.</p>.
     */
    public fun segmentDeliveryConfigurations(vararg segmentDeliveryConfigurations: Any) {
        _segmentDeliveryConfigurations.addAll(listOf(*segmentDeliveryConfigurations))
    }

    /**
     * A list of the segment delivery configurations associated with this resource.</p>.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-segmentdeliveryconfigurations)
     *
     * @param segmentDeliveryConfigurations A list of the segment delivery configurations associated
     *   with this resource.</p>.
     */
    public fun segmentDeliveryConfigurations(segmentDeliveryConfigurations: Collection<Any>) {
        _segmentDeliveryConfigurations.addAll(segmentDeliveryConfigurations)
    }

    /**
     * A list of the segment delivery configurations associated with this resource.</p>.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-segmentdeliveryconfigurations)
     *
     * @param segmentDeliveryConfigurations A list of the segment delivery configurations associated
     *   with this resource.</p>.
     */
    public fun segmentDeliveryConfigurations(segmentDeliveryConfigurations: IResolvable) {
        cdkBuilder.segmentDeliveryConfigurations(segmentDeliveryConfigurations)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-sourcelocationname)
     *
     * @param sourceLocationName
     */
    public fun sourceLocationName(sourceLocationName: String) {
        cdkBuilder.sourceLocationName(sourceLocationName)
    }

    /**
     * The tags to assign to the source location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-tags)
     *
     * @param tags The tags to assign to the source location.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags to assign to the source location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-tags)
     *
     * @param tags The tags to assign to the source location.
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
