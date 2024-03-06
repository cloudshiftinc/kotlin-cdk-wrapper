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

package io.cloudshiftdev.awscdkdsl.services.b2bi

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.b2bi.CfnCapability
import software.amazon.awscdk.services.b2bi.CfnCapabilityProps

/**
 * Properties for defining a `CfnCapability`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.b2bi.*;
 * CfnCapabilityProps cfnCapabilityProps = CfnCapabilityProps.builder()
 * .configuration(CapabilityConfigurationProperty.builder()
 * .edi(EdiConfigurationProperty.builder()
 * .inputLocation(S3LocationProperty.builder()
 * .bucketName("bucketName")
 * .key("key")
 * .build())
 * .outputLocation(S3LocationProperty.builder()
 * .bucketName("bucketName")
 * .key("key")
 * .build())
 * .transformerId("transformerId")
 * .type(EdiTypeProperty.builder()
 * .x12Details(X12DetailsProperty.builder()
 * .transactionSet("transactionSet")
 * .version("version")
 * .build())
 * .build())
 * .build())
 * .build())
 * .name("name")
 * .type("type")
 * // the properties below are optional
 * .instructionsDocuments(List.of(S3LocationProperty.builder()
 * .bucketName("bucketName")
 * .key("key")
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-capability.html)
 */
@CdkDslMarker
public class CfnCapabilityPropsDsl {
    private val cdkBuilder: CfnCapabilityProps.Builder = CfnCapabilityProps.builder()

    private val _instructionsDocuments: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param configuration Specifies a structure that contains the details for a capability. */
    public fun configuration(configuration: IResolvable) {
        cdkBuilder.configuration(configuration)
    }

    /** @param configuration Specifies a structure that contains the details for a capability. */
    public fun configuration(configuration: CfnCapability.CapabilityConfigurationProperty) {
        cdkBuilder.configuration(configuration)
    }

    /**
     * @param instructionsDocuments Specifies one or more locations in Amazon S3, each specifying an
     *   EDI document that can be used with this capability. Each item contains the name of the
     *   bucket and the key, to identify the document's location.
     */
    public fun instructionsDocuments(vararg instructionsDocuments: Any) {
        _instructionsDocuments.addAll(listOf(*instructionsDocuments))
    }

    /**
     * @param instructionsDocuments Specifies one or more locations in Amazon S3, each specifying an
     *   EDI document that can be used with this capability. Each item contains the name of the
     *   bucket and the key, to identify the document's location.
     */
    public fun instructionsDocuments(instructionsDocuments: Collection<Any>) {
        _instructionsDocuments.addAll(instructionsDocuments)
    }

    /**
     * @param instructionsDocuments Specifies one or more locations in Amazon S3, each specifying an
     *   EDI document that can be used with this capability. Each item contains the name of the
     *   bucket and the key, to identify the document's location.
     */
    public fun instructionsDocuments(instructionsDocuments: IResolvable) {
        cdkBuilder.instructionsDocuments(instructionsDocuments)
    }

    /** @param name The display name of the capability. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param tags Specifies the key-value pairs assigned to ARNs that you can use to group and
     *   search for resources by type. You can attach this metadata to resources (capabilities,
     *   partnerships, and so on) for any purpose.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags Specifies the key-value pairs assigned to ARNs that you can use to group and
     *   search for resources by type. You can attach this metadata to resources (capabilities,
     *   partnerships, and so on) for any purpose.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /** @param type Returns the type of the capability. Currently, only `edi` is supported. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnCapabilityProps {
        if (_instructionsDocuments.isNotEmpty())
            cdkBuilder.instructionsDocuments(_instructionsDocuments)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
