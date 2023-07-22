@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.secretsmanager

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ec2.IConnectable
import software.amazon.awscdk.services.ec2.IInterfaceVpcEndpoint
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.secretsmanager.ISecret
import software.amazon.awscdk.services.secretsmanager.SecretRotation
import software.amazon.awscdk.services.secretsmanager.SecretRotationApplication
import software.constructs.Construct

/**
 * Secret rotation for a service or database.
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
public class SecretRotationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: SecretRotation.Builder = SecretRotation.Builder.create(scope, id)

  /**
   * The serverless application for the rotation.
   *
   * @param application The serverless application for the rotation. 
   */
  public fun application(application: SecretRotationApplication) {
    cdkBuilder.application(application)
  }

  /**
   * Specifies the number of days after the previous rotation before Secrets Manager triggers the
   * next automatic rotation.
   *
   * Default: Duration.days(30)
   *
   * @param automaticallyAfter Specifies the number of days after the previous rotation before
   * Secrets Manager triggers the next automatic rotation. 
   */
  public fun automaticallyAfter(automaticallyAfter: Duration) {
    cdkBuilder.automaticallyAfter(automaticallyAfter)
  }

  /**
   * The VPC interface endpoint to use for the Secrets Manager API.
   *
   * If you enable private DNS hostnames for your VPC private endpoint (the default), you don't
   * need to specify an endpoint. The standard Secrets Manager DNS hostname the Secrets Manager
   * CLI and SDKs use by default (https://secretsmanager.<region>.amazonaws.com) automatically
   * resolves to your VPC endpoint.
   *
   * Default: https://secretsmanager.<region>.amazonaws.com
   *
   * @param endpoint The VPC interface endpoint to use for the Secrets Manager API. 
   */
  public fun endpoint(endpoint: IInterfaceVpcEndpoint) {
    cdkBuilder.endpoint(endpoint)
  }

  /**
   * Characters which should not appear in the generated password.
   *
   * Default: - no additional characters are explicitly excluded
   *
   * @param excludeCharacters Characters which should not appear in the generated password. 
   */
  public fun excludeCharacters(excludeCharacters: String) {
    cdkBuilder.excludeCharacters(excludeCharacters)
  }

  /**
   * The master secret for a multi user rotation scheme.
   *
   * Default: - single user rotation scheme
   *
   * @param masterSecret The master secret for a multi user rotation scheme. 
   */
  public fun masterSecret(masterSecret: ISecret) {
    cdkBuilder.masterSecret(masterSecret)
  }

  /**
   * Specifies whether to rotate the secret immediately or wait until the next scheduled rotation
   * window.
   *
   * Default: true
   *
   * @param rotateImmediatelyOnUpdate Specifies whether to rotate the secret immediately or wait
   * until the next scheduled rotation window. 
   */
  public fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: Boolean) {
    cdkBuilder.rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate)
  }

  /**
   * The secret to rotate. It must be a JSON string with the following format:.
   *
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
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secrettargetattachment.html)
   * @param secret The secret to rotate. It must be a JSON string with the following format:. 
   */
  public fun secret(secret: ISecret) {
    cdkBuilder.secret(secret)
  }

  /**
   * The security group for the Lambda rotation function.
   *
   * Default: - a new security group is created
   *
   * @param securityGroup The security group for the Lambda rotation function. 
   */
  public fun securityGroup(securityGroup: ISecurityGroup) {
    cdkBuilder.securityGroup(securityGroup)
  }

  /**
   * The target service or database.
   *
   * @param target The target service or database. 
   */
  public fun target(target: IConnectable) {
    cdkBuilder.target(target)
  }

  /**
   * The VPC where the Lambda rotation function will run.
   *
   * @param vpc The VPC where the Lambda rotation function will run. 
   */
  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

  /**
   * The type of subnets in the VPC where the Lambda rotation function will run.
   *
   * Default: - the Vpc default strategy if not specified.
   *
   * @param vpcSubnets The type of subnets in the VPC where the Lambda rotation function will run. 
   */
  public fun vpcSubnets(vpcSubnets: SubnetSelectionDsl.() -> Unit = {}) {
    val builder = SubnetSelectionDsl()
    builder.apply(vpcSubnets)
    cdkBuilder.vpcSubnets(builder.build())
  }

  /**
   * The type of subnets in the VPC where the Lambda rotation function will run.
   *
   * Default: - the Vpc default strategy if not specified.
   *
   * @param vpcSubnets The type of subnets in the VPC where the Lambda rotation function will run. 
   */
  public fun vpcSubnets(vpcSubnets: SubnetSelection) {
    cdkBuilder.vpcSubnets(vpcSubnets)
  }

  public fun build(): SecretRotation = cdkBuilder.build()
}
