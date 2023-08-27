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
import software.amazon.awscdk.services.mediatailor.CfnVodSourceProps

/**
 * Properties for defining a `CfnVodSource`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediatailor.*;
 * CfnVodSourceProps cfnVodSourceProps = CfnVodSourceProps.builder()
 * .httpPackageConfigurations(List.of(HttpPackageConfigurationProperty.builder()
 * .path("path")
 * .sourceGroup("sourceGroup")
 * .type("type")
 * .build()))
 * .sourceLocationName("sourceLocationName")
 * .vodSourceName("vodSourceName")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-vodsource.html)
 */
@CdkDslMarker
public class CfnVodSourcePropsDsl {
    private val cdkBuilder: CfnVodSourceProps.Builder = CfnVodSourceProps.builder()

    private val _httpPackageConfigurations: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param httpPackageConfigurations A list of HTTP package configuration parameters for this VOD
     *   source.</p>.
     */
    public fun httpPackageConfigurations(vararg httpPackageConfigurations: Any) {
        _httpPackageConfigurations.addAll(listOf(*httpPackageConfigurations))
    }

    /**
     * @param httpPackageConfigurations A list of HTTP package configuration parameters for this VOD
     *   source.</p>.
     */
    public fun httpPackageConfigurations(httpPackageConfigurations: Collection<Any>) {
        _httpPackageConfigurations.addAll(httpPackageConfigurations)
    }

    /**
     * @param httpPackageConfigurations A list of HTTP package configuration parameters for this VOD
     *   source.</p>.
     */
    public fun httpPackageConfigurations(httpPackageConfigurations: IResolvable) {
        cdkBuilder.httpPackageConfigurations(httpPackageConfigurations)
    }

    /** @param sourceLocationName the value to be set. */
    public fun sourceLocationName(sourceLocationName: String) {
        cdkBuilder.sourceLocationName(sourceLocationName)
    }

    /** @param tags The tags to assign to the VOD source. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags to assign to the VOD source. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /** @param vodSourceName the value to be set. */
    public fun vodSourceName(vodSourceName: String) {
        cdkBuilder.vodSourceName(vodSourceName)
    }

    public fun build(): CfnVodSourceProps {
        if (_httpPackageConfigurations.isNotEmpty())
            cdkBuilder.httpPackageConfigurations(_httpPackageConfigurations)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
