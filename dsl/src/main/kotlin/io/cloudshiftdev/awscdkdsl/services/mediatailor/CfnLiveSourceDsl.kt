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
import software.amazon.awscdk.services.mediatailor.CfnLiveSource
import software.constructs.Construct

/**
 * Definition of AWS::MediaTailor::LiveSource Resource Type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediatailor.*;
 * CfnLiveSource cfnLiveSource = CfnLiveSource.Builder.create(this, "MyCfnLiveSource")
 * .httpPackageConfigurations(List.of(HttpPackageConfigurationProperty.builder()
 * .path("path")
 * .sourceGroup("sourceGroup")
 * .type("type")
 * .build()))
 * .liveSourceName("liveSourceName")
 * .sourceLocationName("sourceLocationName")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-livesource.html)
 */
@CdkDslMarker
public class CfnLiveSourceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnLiveSource.Builder = CfnLiveSource.Builder.create(scope, id)

    private val _httpPackageConfigurations: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * A list of HTTP package configuration parameters for this live source.</p>.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-livesource.html#cfn-mediatailor-livesource-httppackageconfigurations)
     *
     * @param httpPackageConfigurations A list of HTTP package configuration parameters for this
     *   live source.</p>.
     */
    public fun httpPackageConfigurations(vararg httpPackageConfigurations: Any) {
        _httpPackageConfigurations.addAll(listOf(*httpPackageConfigurations))
    }

    /**
     * A list of HTTP package configuration parameters for this live source.</p>.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-livesource.html#cfn-mediatailor-livesource-httppackageconfigurations)
     *
     * @param httpPackageConfigurations A list of HTTP package configuration parameters for this
     *   live source.</p>.
     */
    public fun httpPackageConfigurations(httpPackageConfigurations: Collection<Any>) {
        _httpPackageConfigurations.addAll(httpPackageConfigurations)
    }

    /**
     * A list of HTTP package configuration parameters for this live source.</p>.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-livesource.html#cfn-mediatailor-livesource-httppackageconfigurations)
     *
     * @param httpPackageConfigurations A list of HTTP package configuration parameters for this
     *   live source.</p>.
     */
    public fun httpPackageConfigurations(httpPackageConfigurations: IResolvable) {
        cdkBuilder.httpPackageConfigurations(httpPackageConfigurations)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-livesource.html#cfn-mediatailor-livesource-livesourcename)
     *
     * @param liveSourceName
     */
    public fun liveSourceName(liveSourceName: String) {
        cdkBuilder.liveSourceName(liveSourceName)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-livesource.html#cfn-mediatailor-livesource-sourcelocationname)
     *
     * @param sourceLocationName
     */
    public fun sourceLocationName(sourceLocationName: String) {
        cdkBuilder.sourceLocationName(sourceLocationName)
    }

    /**
     * The tags to assign to the live source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-livesource.html#cfn-mediatailor-livesource-tags)
     *
     * @param tags The tags to assign to the live source.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags to assign to the live source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-livesource.html#cfn-mediatailor-livesource-tags)
     *
     * @param tags The tags to assign to the live source.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnLiveSource {
        if (_httpPackageConfigurations.isNotEmpty())
            cdkBuilder.httpPackageConfigurations(_httpPackageConfigurations)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
