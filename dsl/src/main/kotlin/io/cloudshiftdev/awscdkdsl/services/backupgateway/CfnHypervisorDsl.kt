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
import software.amazon.awscdk.services.backupgateway.CfnHypervisor
import software.constructs.Construct

/**
 * Represents the hypervisor's permissions to which the gateway will connect.
 *
 * A hypervisor is hardware, software, or firmware that creates and manages virtual machines, and
 * allocates resources to them.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.backupgateway.*;
 * CfnHypervisor cfnHypervisor = CfnHypervisor.Builder.create(this, "MyCfnHypervisor")
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
public class CfnHypervisorDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnHypervisor.Builder = CfnHypervisor.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The server host of the hypervisor.
     *
     * This can be either an IP address or a fully-qualified domain name (FQDN).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backupgateway-hypervisor.html#cfn-backupgateway-hypervisor-host)
     *
     * @param host The server host of the hypervisor.
     */
    public fun host(host: String) {
        cdkBuilder.host(host)
    }

    /**
     * The Amazon Resource Name (ARN) of the AWS Key Management Service used to encrypt the
     * hypervisor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backupgateway-hypervisor.html#cfn-backupgateway-hypervisor-kmskeyarn)
     *
     * @param kmsKeyArn The Amazon Resource Name (ARN) of the AWS Key Management Service used to
     *   encrypt the hypervisor.
     */
    public fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    /**
     * The Amazon Resource Name (ARN) of the group of gateways within the requested log.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backupgateway-hypervisor.html#cfn-backupgateway-hypervisor-loggrouparn)
     *
     * @param logGroupArn The Amazon Resource Name (ARN) of the group of gateways within the
     *   requested log.
     */
    public fun logGroupArn(logGroupArn: String) {
        cdkBuilder.logGroupArn(logGroupArn)
    }

    /**
     * The name of the hypervisor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backupgateway-hypervisor.html#cfn-backupgateway-hypervisor-name)
     *
     * @param name The name of the hypervisor.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The password for the hypervisor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backupgateway-hypervisor.html#cfn-backupgateway-hypervisor-password)
     *
     * @param password The password for the hypervisor.
     */
    public fun password(password: String) {
        cdkBuilder.password(password)
    }

    /**
     * The tags of the hypervisor configuration to import.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backupgateway-hypervisor.html#cfn-backupgateway-hypervisor-tags)
     *
     * @param tags The tags of the hypervisor configuration to import.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags of the hypervisor configuration to import.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backupgateway-hypervisor.html#cfn-backupgateway-hypervisor-tags)
     *
     * @param tags The tags of the hypervisor configuration to import.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The username for the hypervisor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backupgateway-hypervisor.html#cfn-backupgateway-hypervisor-username)
     *
     * @param username The username for the hypervisor.
     */
    public fun username(username: String) {
        cdkBuilder.username(username)
    }

    public fun build(): CfnHypervisor {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
