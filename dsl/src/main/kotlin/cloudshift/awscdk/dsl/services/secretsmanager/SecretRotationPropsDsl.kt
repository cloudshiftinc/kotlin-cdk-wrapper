@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.secretsmanager

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ec2.IConnectable
import software.amazon.awscdk.services.ec2.IInterfaceVpcEndpoint
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.secretsmanager.ISecret
import software.amazon.awscdk.services.secretsmanager.SecretRotationApplication
import software.amazon.awscdk.services.secretsmanager.SecretRotationProps
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Construction properties for a SecretRotation.
 *
 * Example:
 *
 * ```
 * Secret myUserSecret;
 * Secret myMasterSecret;
 * IConnectable myDatabase;
 * Vpc myVpc;
 * SecretRotation.Builder.create(this, "SecretRotation")
 * .application(SecretRotationApplication.MYSQL_ROTATION_MULTI_USER)
 * .secret(myUserSecret) // The secret that will be rotated
 * .masterSecret(myMasterSecret) // The secret used for the rotation
 * .target(myDatabase)
 * .vpc(myVpc)
 * .build();
 * ```
 */
@CdkDslMarker
public class SecretRotationPropsDsl {
    private val cdkBuilder: SecretRotationProps.Builder = SecretRotationProps.builder()

    /**
     * @param application The serverless application for the rotation.
     */
    public fun application(application: SecretRotationApplication) {
        cdkBuilder.application(application)
    }

    /**
     * @param automaticallyAfter Specifies the number of days after the previous rotation before
     * Secrets Manager triggers the next automatic rotation.
     */
    public fun automaticallyAfter(automaticallyAfter: Duration) {
        cdkBuilder.automaticallyAfter(automaticallyAfter)
    }

    /**
     * @param endpoint The VPC interface endpoint to use for the Secrets Manager API.
     * If you enable private DNS hostnames for your VPC private endpoint (the default), you don't
     * need to specify an endpoint. The standard Secrets Manager DNS hostname the Secrets Manager
     * CLI and SDKs use by default (https://secretsmanager.<region>.amazonaws.com) automatically
     * resolves to your VPC endpoint.
     */
    public fun endpoint(endpoint: IInterfaceVpcEndpoint) {
        cdkBuilder.endpoint(endpoint)
    }

    /**
     * @param excludeCharacters Characters which should not appear in the generated password.
     */
    public fun excludeCharacters(excludeCharacters: String) {
        cdkBuilder.excludeCharacters(excludeCharacters)
    }

    /**
     * @param masterSecret The master secret for a multi user rotation scheme.
     */
    public fun masterSecret(masterSecret: ISecret) {
        cdkBuilder.masterSecret(masterSecret)
    }

    /**
     * @param rotateImmediatelyOnUpdate Specifies whether to rotate the secret immediately or wait
     * until the next scheduled rotation window.
     */
    public fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: Boolean) {
        cdkBuilder.rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate)
    }

    /**
     * @param secret The secret to rotate. It must be a JSON string with the following format:.
     * ```
     * {
     * "engine": &lt;required: database engine&gt;,
     * "host": &lt;required: instance host name&gt;,
     * "username": &lt;required: username&gt;,
     * "password": &lt;required: password&gt;,
     * "dbname": &lt;optional: database name&gt;,
     * "port": &lt;optional: if not specified, default port will be used&gt;,
     * "masterarn": &lt;required for multi user rotation: the arn of the master secret which will be
     * used to create users/change passwords&gt;
     * }
     * ```
     *
     * This is typically the case for a secret referenced from an
     * `AWS::SecretsManager::SecretTargetAttachment`
     * or an `ISecret` returned by the `attach()` method of `Secret`.
     */
    public fun secret(secret: ISecret) {
        cdkBuilder.secret(secret)
    }

    /**
     * @param securityGroup The security group for the Lambda rotation function.
     */
    public fun securityGroup(securityGroup: ISecurityGroup) {
        cdkBuilder.securityGroup(securityGroup)
    }

    /**
     * @param target The target service or database.
     */
    public fun target(target: IConnectable) {
        cdkBuilder.target(target)
    }

    /**
     * @param vpc The VPC where the Lambda rotation function will run.
     */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    /**
     * @param vpcSubnets The type of subnets in the VPC where the Lambda rotation function will run.
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(vpcSubnets)
        cdkBuilder.vpcSubnets(builder.build())
    }

    /**
     * @param vpcSubnets The type of subnets in the VPC where the Lambda rotation function will run.
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection) {
        cdkBuilder.vpcSubnets(vpcSubnets)
    }

    public fun build(): SecretRotationProps = cdkBuilder.build()
}
