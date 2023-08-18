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

package io.cloudshiftdev.awscdkdsl.services.rds

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.services.ec2.SubnetSelectionDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ec2.IInterfaceVpcEndpoint
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.rds.RotationMultiUserOptions
import software.amazon.awscdk.services.secretsmanager.ISecret

/**
 * Options to add the multi user rotation.
 *
 * Example:
 * ```
 * DatabaseInstance instance;
 * DatabaseSecret myImportedSecret;
 * instance.addRotationMultiUser("MyUser", RotationMultiUserOptions.builder()
 * .secret(myImportedSecret)
 * .build());
 * ```
 */
@CdkDslMarker
public class RotationMultiUserOptionsDsl {
    private val cdkBuilder: RotationMultiUserOptions.Builder = RotationMultiUserOptions.builder()

    /**
     * @param automaticallyAfter Specifies the number of days after the previous rotation before
     *   Secrets Manager triggers the next automatic rotation.
     */
    public fun automaticallyAfter(automaticallyAfter: Duration) {
        cdkBuilder.automaticallyAfter(automaticallyAfter)
    }

    /**
     * @param endpoint The VPC interface endpoint to use for the Secrets Manager API. If you enable
     *   private DNS hostnames for your VPC private endpoint (the default), you don't need to
     *   specify an endpoint. The standard Secrets Manager DNS hostname the Secrets Manager CLI and
     *   SDKs use by default (https://secretsmanager.<region>.amazonaws.com) automatically resolves
     *   to your VPC endpoint.
     */
    public fun endpoint(endpoint: IInterfaceVpcEndpoint) {
        cdkBuilder.endpoint(endpoint)
    }

    /** @param excludeCharacters Specifies characters to not include in generated passwords. */
    public fun excludeCharacters(excludeCharacters: String) {
        cdkBuilder.excludeCharacters(excludeCharacters)
    }

    /**
     * @param rotateImmediatelyOnUpdate Specifies whether to rotate the secret immediately or wait
     *   until the next scheduled rotation window.
     */
    public fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: Boolean) {
        cdkBuilder.rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate)
    }

    /**
     * @param secret The secret to rotate. It must be a JSON string with the following format:
     * ```
     * {
     * "engine": &lt;required: database engine&gt;,
     * "host": &lt;required: instance host name&gt;,
     * "username": &lt;required: username&gt;,
     * "password": &lt;required: password&gt;,
     * "dbname": &lt;optional: database name&gt;,
     * "port": &lt;optional: if not specified, default port will be used&gt;,
     * "masterarn": &lt;required: the arn of the master secret which will be used to create
     * users/change passwords&gt;
     * }
     * ```
     */
    public fun secret(secret: ISecret) {
        cdkBuilder.secret(secret)
    }

    /** @param securityGroup The security group for the Lambda rotation function. */
    public fun securityGroup(securityGroup: ISecurityGroup) {
        cdkBuilder.securityGroup(securityGroup)
    }

    /** @param vpcSubnets Where to place the rotation Lambda function. */
    public fun vpcSubnets(vpcSubnets: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(vpcSubnets)
        cdkBuilder.vpcSubnets(builder.build())
    }

    /** @param vpcSubnets Where to place the rotation Lambda function. */
    public fun vpcSubnets(vpcSubnets: SubnetSelection) {
        cdkBuilder.vpcSubnets(vpcSubnets)
    }

    public fun build(): RotationMultiUserOptions = cdkBuilder.build()
}
