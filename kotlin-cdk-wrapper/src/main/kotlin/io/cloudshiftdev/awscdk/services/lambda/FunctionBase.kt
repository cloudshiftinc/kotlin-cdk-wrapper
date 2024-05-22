@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.IClientVpnConnectionHandler
import io.cloudshiftdev.awscdk.services.iam.CompositePrincipal
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.constructs.Construct
import io.cloudshiftdev.constructs.Node
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 *
 */
public abstract class FunctionBase(
  cdkObject: software.amazon.awscdk.services.lambda.FunctionBase,
) : Resource(cdkObject), IFunction, IClientVpnConnectionHandler {
  /**
   * Adds an event source to this function.
   *
   * Event sources are implemented in the aws-cdk-lib/aws-lambda-event-sources module.
   *
   * The following example adds an SQS Queue as an event source:
   *
   * ```
   * import { SqsEventSource } from 'aws-cdk-lib/aws-lambda-event-sources';
   * myFunction.addEventSource(new SqsEventSource(myQueue));
   * ```
   *
   * @param source 
   */
  public override fun addEventSource(source: IEventSource) {
    unwrap(this).addEventSource(source.let(IEventSource.Companion::unwrap))
  }

  /**
   * Adds an event source that maps to this AWS Lambda function.
   *
   * @param id 
   * @param options 
   */
  public override fun addEventSourceMapping(id: String, options: EventSourceMappingOptions):
      EventSourceMapping = unwrap(this).addEventSourceMapping(id,
      options.let(EventSourceMappingOptions.Companion::unwrap)).let(EventSourceMapping::wrap)

  /**
   * Adds an event source that maps to this AWS Lambda function.
   *
   * @param id 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e1a42ee4d3635728f011b89020cb9e266d5ec086cc3638388b952c384adc89b9")
  public override fun addEventSourceMapping(id: String,
      options: EventSourceMappingOptions.Builder.() -> Unit): EventSourceMapping =
      addEventSourceMapping(id, EventSourceMappingOptions(options))

  /**
   * Adds a url to this lambda function.
   *
   * @param options
   */
  public override fun addFunctionUrl(): FunctionUrl =
      unwrap(this).addFunctionUrl().let(FunctionUrl::wrap)

  /**
   * Adds a url to this lambda function.
   *
   * @param options
   */
  public override fun addFunctionUrl(options: FunctionUrlOptions): FunctionUrl =
      unwrap(this).addFunctionUrl(options.let(FunctionUrlOptions.Companion::unwrap)).let(FunctionUrl::wrap)

  /**
   * Adds a url to this lambda function.
   *
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bc489a994cc127e25ae321702e1246a654ec80f2c2c2c9c9399e6bdb53dab162")
  public override fun addFunctionUrl(options: FunctionUrlOptions.Builder.() -> Unit): FunctionUrl =
      addFunctionUrl(FunctionUrlOptions(options))

  /**
   * Adds a permission to the Lambda resource policy.
   *
   * [Documentation](Permission for details.)
   * @param id The id for the permission construct. 
   * @param permission The permission to grant to this Lambda function. 
   */
  public override fun addPermission(id: String, permission: Permission) {
    unwrap(this).addPermission(id, permission.let(Permission.Companion::unwrap))
  }

  /**
   * Adds a permission to the Lambda resource policy.
   *
   * [Documentation](Permission for details.)
   * @param id The id for the permission construct. 
   * @param permission The permission to grant to this Lambda function. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ab1e13b50521b14748449d1cedaddd4f97568ffa4bbbeb7d2cea25e84b0ce6c2")
  public override fun addPermission(id: String, permission: Permission.Builder.() -> Unit): Unit =
      addPermission(id, Permission(permission))

  /**
   * Adds a statement to the IAM role assumed by the instance.
   *
   * @param statement 
   */
  public override fun addToRolePolicy(statement: PolicyStatement) {
    unwrap(this).addToRolePolicy(statement.let(PolicyStatement.Companion::unwrap))
  }

  /**
   * Adds a statement to the IAM role assumed by the instance.
   *
   * @param statement 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ccef0414b9292b425848f90820fb8748386b8cf1c85b1012acc59056410c2329")
  public override fun addToRolePolicy(statement: PolicyStatement.Builder.() -> Unit): Unit =
      addToRolePolicy(PolicyStatement(statement))

  /**
   * The architecture of this Lambda Function.
   */
  public override fun architecture(): Architecture =
      unwrap(this).getArchitecture().let(Architecture::wrap)

  /**
   * Configures options for asynchronous invocation.
   *
   * @param options 
   */
  public override fun configureAsyncInvoke(options: EventInvokeConfigOptions) {
    unwrap(this).configureAsyncInvoke(options.let(EventInvokeConfigOptions.Companion::unwrap))
  }

  /**
   * Configures options for asynchronous invocation.
   *
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b85c1a6f6a657150d5fca517e75d094e687b3217c04d318f2be78e23e7c059ee")
  public override fun configureAsyncInvoke(options: EventInvokeConfigOptions.Builder.() -> Unit):
      Unit = configureAsyncInvoke(EventInvokeConfigOptions(options))

  /**
   * Access the Connections object.
   *
   * Will fail if not a VPC-enabled Lambda Function
   */
  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  /**
   * A warning will be added to functions under the following conditions: - permissions that include
   * `lambda:InvokeFunction` are added to the unqualified function.
   *
   * * function.currentVersion is invoked before or after the permission is created.
   *
   * This applies only to permissions on Lambda functions, not versions or aliases.
   * This function is overridden as a noOp for QualifiedFunctionBase.
   *
   * @param scope 
   * @param action 
   */
  public open fun considerWarningOnInvokeFunctionPermissions(scope: Construct, action: String) {
    unwrap(this).considerWarningOnInvokeFunctionPermissions(scope.let(Construct.Companion::unwrap),
        action)
  }

  /**
   * The ARN fo the function.
   */
  public override fun functionArn(): String = unwrap(this).getFunctionArn()

  /**
   * The name of the function.
   */
  public override fun functionName(): String = unwrap(this).getFunctionName()

  /**
   * Grant the given identity permissions to invoke this Lambda.
   *
   * @param grantee 
   */
  public override fun grantInvoke(grantee: IGrantable): Grant =
      unwrap(this).grantInvoke(grantee.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

  /**
   * Grant multiple principals the ability to invoke this Lambda via CompositePrincipal.
   *
   * @param compositePrincipal 
   */
  public override fun grantInvokeCompositePrincipal(compositePrincipal: CompositePrincipal):
      List<Grant> =
      unwrap(this).grantInvokeCompositePrincipal(compositePrincipal.let(CompositePrincipal.Companion::unwrap)).map(Grant::wrap)

  /**
   * Grant the given identity permissions to invoke this Lambda Function URL.
   *
   * @param grantee 
   */
  public override fun grantInvokeUrl(grantee: IGrantable): Grant =
      unwrap(this).grantInvokeUrl(grantee.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

  /**
   * The principal this Lambda Function is running as.
   */
  public override fun grantPrincipal(): IPrincipal =
      unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

  /**
   * Whether or not this Lambda function was bound to a VPC.
   *
   * If this is is `false`, trying to access the `connections` object will fail.
   */
  public override fun isBoundToVpc(): Boolean = unwrap(this).getIsBoundToVpc()

  /**
   * The `$LATEST` version of this function.
   *
   * Note that this is reference to a non-specific AWS Lambda version, which
   * means the function this version refers to can return different results in
   * different invocations.
   *
   * To obtain a reference to an explicit version which references the current
   * function configuration, use `lambdaFunction.currentVersion` instead.
   */
  public override fun latestVersion(): IVersion =
      unwrap(this).getLatestVersion().let(IVersion::wrap)

  /**
   * Return the given named metric for this Function.
   *
   * @param metricName 
   * @param props
   */
  public override fun metric(metricName: String): Metric =
      unwrap(this).metric(metricName).let(Metric::wrap)

  /**
   * Return the given named metric for this Function.
   *
   * @param metricName 
   * @param props
   */
  public override fun metric(metricName: String, props: MetricOptions): Metric =
      unwrap(this).metric(metricName, props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * Return the given named metric for this Function.
   *
   * @param metricName 
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public override fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
      metric(metricName, MetricOptions(props))

  /**
   * How long execution of this Lambda takes.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public override fun metricDuration(): Metric = unwrap(this).metricDuration().let(Metric::wrap)

  /**
   * How long execution of this Lambda takes.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public override fun metricDuration(props: MetricOptions): Metric =
      unwrap(this).metricDuration(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * How long execution of this Lambda takes.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4ea8a7b75f617289e62bb7a84f391e0dfba5ed29384b388b6af080b47b00e619")
  public override fun metricDuration(props: MetricOptions.Builder.() -> Unit): Metric =
      metricDuration(MetricOptions(props))

  /**
   * How many invocations of this Lambda fail.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public override fun metricErrors(): Metric = unwrap(this).metricErrors().let(Metric::wrap)

  /**
   * How many invocations of this Lambda fail.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public override fun metricErrors(props: MetricOptions): Metric =
      unwrap(this).metricErrors(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * How many invocations of this Lambda fail.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("35a6413eeb4163b1b71b829794e56c9dcdd5a733bbb4fad94ee2cb3a0267d941")
  public override fun metricErrors(props: MetricOptions.Builder.() -> Unit): Metric =
      metricErrors(MetricOptions(props))

  /**
   * How often this Lambda is invoked.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public override fun metricInvocations(): Metric =
      unwrap(this).metricInvocations().let(Metric::wrap)

  /**
   * How often this Lambda is invoked.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public override fun metricInvocations(props: MetricOptions): Metric =
      unwrap(this).metricInvocations(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * How often this Lambda is invoked.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6a03faa9f4e6ab06d879372d43628c35937b122c9853c734195167cad56a2614")
  public override fun metricInvocations(props: MetricOptions.Builder.() -> Unit): Metric =
      metricInvocations(MetricOptions(props))

  /**
   * How often this Lambda is throttled.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public override fun metricThrottles(): Metric = unwrap(this).metricThrottles().let(Metric::wrap)

  /**
   * How often this Lambda is throttled.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public override fun metricThrottles(props: MetricOptions): Metric =
      unwrap(this).metricThrottles(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * How often this Lambda is throttled.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2c66b543d0ee791c9157b75f01987fb80ab6ef611d23006ace8925909dc84e3f")
  public override fun metricThrottles(props: MetricOptions.Builder.() -> Unit): Metric =
      metricThrottles(MetricOptions(props))

  /**
   * The construct node where permissions are attached.
   */
  public override fun permissionsNode(): Node = unwrap(this).getPermissionsNode().let(Node::wrap)

  /**
   * The ARN(s) to put into the resource field of the generated IAM policy for grantInvoke().
   */
  public override fun resourceArnsForGrantInvoke(): List<String> =
      unwrap(this).getResourceArnsForGrantInvoke()

  /**
   * The IAM role associated with this function.
   *
   * Undefined if the function was imported without a role.
   */
  public override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.FunctionBase,
  ) : FunctionBase(cdkObject)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.FunctionBase): FunctionBase
        = CdkObjectWrappers.wrap(cdkObject) as? FunctionBase ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: FunctionBase): software.amazon.awscdk.services.lambda.FunctionBase
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.lambda.FunctionBase
  }
}
