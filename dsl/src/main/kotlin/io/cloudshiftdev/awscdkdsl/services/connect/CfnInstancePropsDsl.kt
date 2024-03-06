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

package io.cloudshiftdev.awscdkdsl.services.connect

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnInstance
import software.amazon.awscdk.services.connect.CfnInstanceProps

/**
 * Properties for defining a `CfnInstance`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * CfnInstanceProps cfnInstanceProps = CfnInstanceProps.builder()
 * .attributes(AttributesProperty.builder()
 * .inboundCalls(false)
 * .outboundCalls(false)
 * // the properties below are optional
 * .autoResolveBestVoices(false)
 * .contactflowLogs(false)
 * .contactLens(false)
 * .earlyMedia(false)
 * .useCustomTtsVoices(false)
 * .build())
 * .identityManagementType("identityManagementType")
 * // the properties below are optional
 * .directoryId("directoryId")
 * .instanceAlias("instanceAlias")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instance.html)
 */
@CdkDslMarker
public class CfnInstancePropsDsl {
    private val cdkBuilder: CfnInstanceProps.Builder = CfnInstanceProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param attributes A toggle for an individual feature at the instance level. */
    public fun attributes(attributes: IResolvable) {
        cdkBuilder.attributes(attributes)
    }

    /** @param attributes A toggle for an individual feature at the instance level. */
    public fun attributes(attributes: CfnInstance.AttributesProperty) {
        cdkBuilder.attributes(attributes)
    }

    /** @param directoryId The identifier for the directory. */
    public fun directoryId(directoryId: String) {
        cdkBuilder.directoryId(directoryId)
    }

    /** @param identityManagementType The identity management type. */
    public fun identityManagementType(identityManagementType: String) {
        cdkBuilder.identityManagementType(identityManagementType)
    }

    /**
     * @param instanceAlias The alias of instance. `InstanceAlias` is only required when
     *   `IdentityManagementType` is `CONNECT_MANAGED` or `SAML` . `InstanceAlias` is not required
     *   when `IdentityManagementType` is `EXISTING_DIRECTORY` .
     */
    public fun instanceAlias(instanceAlias: String) {
        cdkBuilder.instanceAlias(instanceAlias)
    }

    /** @param tags An array of key-value pairs to apply to this resource. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags An array of key-value pairs to apply to this resource. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnInstanceProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
