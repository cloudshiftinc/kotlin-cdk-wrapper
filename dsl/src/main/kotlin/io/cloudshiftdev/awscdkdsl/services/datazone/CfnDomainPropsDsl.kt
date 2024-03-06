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

package io.cloudshiftdev.awscdkdsl.services.datazone

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.datazone.CfnDomain
import software.amazon.awscdk.services.datazone.CfnDomainProps

/**
 * Properties for defining a `CfnDomain`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datazone.*;
 * CfnDomainProps cfnDomainProps = CfnDomainProps.builder()
 * .domainExecutionRole("domainExecutionRole")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .kmsKeyIdentifier("kmsKeyIdentifier")
 * .singleSignOn(SingleSignOnProperty.builder()
 * .type("type")
 * .userAssignment("userAssignment")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-domain.html)
 */
@CdkDslMarker
public class CfnDomainPropsDsl {
    private val cdkBuilder: CfnDomainProps.Builder = CfnDomainProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param description The description of the Amazon DataZone domain. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param domainExecutionRole The domain execution role that is created when an Amazon DataZone
     *   domain is created. The domain execution role is created in the AWS account that houses the
     *   Amazon DataZone domain.
     */
    public fun domainExecutionRole(domainExecutionRole: String) {
        cdkBuilder.domainExecutionRole(domainExecutionRole)
    }

    /**
     * @param kmsKeyIdentifier The identifier of the AWS Key Management Service (KMS) key that is
     *   used to encrypt the Amazon DataZone domain, metadata, and reporting data.
     */
    public fun kmsKeyIdentifier(kmsKeyIdentifier: String) {
        cdkBuilder.kmsKeyIdentifier(kmsKeyIdentifier)
    }

    /** @param name The name of the Amazon DataZone domain. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param singleSignOn The single sign-on details in Amazon DataZone. */
    public fun singleSignOn(singleSignOn: IResolvable) {
        cdkBuilder.singleSignOn(singleSignOn)
    }

    /** @param singleSignOn The single sign-on details in Amazon DataZone. */
    public fun singleSignOn(singleSignOn: CfnDomain.SingleSignOnProperty) {
        cdkBuilder.singleSignOn(singleSignOn)
    }

    /** @param tags The tags specified for the Amazon DataZone domain. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags specified for the Amazon DataZone domain. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDomainProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
