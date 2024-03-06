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

package io.cloudshiftdev.awscdkdsl.services.backupgateway

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.backupgateway.CfnHypervisorProps

/**
 * Properties for defining a `CfnHypervisor`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.backupgateway.*;
 * CfnHypervisorProps cfnHypervisorProps = CfnHypervisorProps.builder()
 * .host("host")
 * .kmsKeyArn("kmsKeyArn")
 * .logGroupArn("logGroupArn")
 * .name("name")
 * .password("password")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .username("username")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backupgateway-hypervisor.html)
 */
@CdkDslMarker
public class CfnHypervisorPropsDsl {
    private val cdkBuilder: CfnHypervisorProps.Builder = CfnHypervisorProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param host The server host of the hypervisor. This can be either an IP address or a
     *   fully-qualified domain name (FQDN).
     */
    public fun host(host: String) {
        cdkBuilder.host(host)
    }

    /**
     * @param kmsKeyArn The Amazon Resource Name (ARN) of the AWS Key Management Service used to
     *   encrypt the hypervisor.
     */
    public fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    /**
     * @param logGroupArn The Amazon Resource Name (ARN) of the group of gateways within the
     *   requested log.
     */
    public fun logGroupArn(logGroupArn: String) {
        cdkBuilder.logGroupArn(logGroupArn)
    }

    /** @param name The name of the hypervisor. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param password The password for the hypervisor. */
    public fun password(password: String) {
        cdkBuilder.password(password)
    }

    /** @param tags The tags of the hypervisor configuration to import. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags of the hypervisor configuration to import. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /** @param username The username for the hypervisor. */
    public fun username(username: String) {
        cdkBuilder.username(username)
    }

    public fun build(): CfnHypervisorProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
