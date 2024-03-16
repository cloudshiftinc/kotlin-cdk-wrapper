@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.iam.CompositePrincipal
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.constructs.Node
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 *
 */
public interface IFunction : IResource, IConnectable, IGrantable {
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
  public fun addEventSource(source: IEventSource)

  /**
   * Adds an event source that maps to this AWS Lambda function.
   *
   * @param id construct ID. 
   * @param options mapping options. 
   */
  public fun addEventSourceMapping(id: String, options: EventSourceMappingOptions):
      EventSourceMapping

  /**
   * Adds an event source that maps to this AWS Lambda function.
   *
   * @param id construct ID. 
   * @param options mapping options. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e1a42ee4d3635728f011b89020cb9e266d5ec086cc3638388b952c384adc89b9")
  public fun addEventSourceMapping(id: String,
      options: EventSourceMappingOptions.Builder.() -> Unit): EventSourceMapping

  /**
   * Adds a url to this lambda function.
   *
   * @param options
   */
  public fun addFunctionUrl(): FunctionUrl

  /**
   * Adds a url to this lambda function.
   *
   * @param options
   */
  public fun addFunctionUrl(options: FunctionUrlOptions): FunctionUrl

  /**
   * Adds a url to this lambda function.
   *
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bc489a994cc127e25ae321702e1246a654ec80f2c2c2c9c9399e6bdb53dab162")
  public fun addFunctionUrl(options: FunctionUrlOptions.Builder.() -> Unit): FunctionUrl

  /**
   * Adds a permission to the Lambda resource policy.
   *
   * [Documentation](Permission for details.)
   * @param id The id for the permission construct. 
   * @param permission The permission to grant to this Lambda function. 
   */
  public fun addPermission(id: String, permission: Permission)

  /**
   * Adds a permission to the Lambda resource policy.
   *
   * [Documentation](Permission for details.)
   * @param id The id for the permission construct. 
   * @param permission The permission to grant to this Lambda function. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ab1e13b50521b14748449d1cedaddd4f97568ffa4bbbeb7d2cea25e84b0ce6c2")
  public fun addPermission(id: String, permission: Permission.Builder.() -> Unit)

  /**
   * Adds a statement to the IAM role assumed by the instance.
   *
   * @param statement 
   */
  public fun addToRolePolicy(statement: PolicyStatement)

  /**
   * Adds a statement to the IAM role assumed by the instance.
   *
   * @param statement 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ccef0414b9292b425848f90820fb8748386b8cf1c85b1012acc59056410c2329")
  public fun addToRolePolicy(statement: PolicyStatement.Builder.() -> Unit)

  /**
   * The system architectures compatible with this lambda function.
   */
  public fun architecture(): Architecture

  /**
   * Configures options for asynchronous invocation.
   *
   * @param options 
   */
  public fun configureAsyncInvoke(options: EventInvokeConfigOptions)

  /**
   * Configures options for asynchronous invocation.
   *
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b85c1a6f6a657150d5fca517e75d094e687b3217c04d318f2be78e23e7c059ee")
  public fun configureAsyncInvoke(options: EventInvokeConfigOptions.Builder.() -> Unit)

  /**
   * The ARN of the function.
   */
  public fun functionArn(): String

  /**
   * The name of the function.
   */
  public fun functionName(): String

  /**
   * Grant the given identity permissions to invoke this Lambda.
   *
   * @param identity 
   */
  public fun grantInvoke(identity: IGrantable): Grant

  /**
   * Grant multiple principals the ability to invoke this Lambda via CompositePrincipal.
   *
   * @param compositePrincipal 
   */
  public fun grantInvokeCompositePrincipal(compositePrincipal: CompositePrincipal): List<Grant>

  /**
   * Grant the given identity permissions to invoke this Lambda Function URL.
   *
   * @param identity 
   */
  public fun grantInvokeUrl(identity: IGrantable): Grant

  /**
   * Whether or not this Lambda function was bound to a VPC.
   *
   * If this is is `false`, trying to access the `connections` object will fail.
   */
  public fun isBoundToVpc(): Boolean

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
  public fun latestVersion(): IVersion

  /**
   * Return the given named metric for this Lambda Return the given named metric for this Function.
   *
   * @param metricName 
   * @param props
   */
  public fun metric(metricName: String): Metric

  /**
   * Return the given named metric for this Lambda Return the given named metric for this Function.
   *
   * @param metricName 
   * @param props
   */
  public fun metric(metricName: String, props: MetricOptions): Metric

  /**
   * Return the given named metric for this Lambda Return the given named metric for this Function.
   *
   * @param metricName 
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Metric for the Duration of this Lambda How long execution of this Lambda takes.
   *
   * Average over 5 minutes
   *
   * Default: average over 5 minutes
   *
   * @param props
   */
  public fun metricDuration(): Metric

  /**
   * Metric for the Duration of this Lambda How long execution of this Lambda takes.
   *
   * Average over 5 minutes
   *
   * Default: average over 5 minutes
   *
   * @param props
   */
  public fun metricDuration(props: MetricOptions): Metric

  /**
   * Metric for the Duration of this Lambda How long execution of this Lambda takes.
   *
   * Average over 5 minutes
   *
   * Default: average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4ea8a7b75f617289e62bb7a84f391e0dfba5ed29384b388b6af080b47b00e619")
  public fun metricDuration(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * How many invocations of this Lambda fail.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public fun metricErrors(): Metric

  /**
   * How many invocations of this Lambda fail.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public fun metricErrors(props: MetricOptions): Metric

  /**
   * How many invocations of this Lambda fail.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("35a6413eeb4163b1b71b829794e56c9dcdd5a733bbb4fad94ee2cb3a0267d941")
  public fun metricErrors(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Metric for the number of invocations of this Lambda How often this Lambda is invoked.
   *
   * Sum over 5 minutes
   *
   * Default: sum over 5 minutes
   *
   * @param props
   */
  public fun metricInvocations(): Metric

  /**
   * Metric for the number of invocations of this Lambda How often this Lambda is invoked.
   *
   * Sum over 5 minutes
   *
   * Default: sum over 5 minutes
   *
   * @param props
   */
  public fun metricInvocations(props: MetricOptions): Metric

  /**
   * Metric for the number of invocations of this Lambda How often this Lambda is invoked.
   *
   * Sum over 5 minutes
   *
   * Default: sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6a03faa9f4e6ab06d879372d43628c35937b122c9853c734195167cad56a2614")
  public fun metricInvocations(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Metric for the number of throttled invocations of this Lambda How often this Lambda is
   * throttled.
   *
   * Sum over 5 minutes
   *
   * Default: sum over 5 minutes
   *
   * @param props
   */
  public fun metricThrottles(): Metric

  /**
   * Metric for the number of throttled invocations of this Lambda How often this Lambda is
   * throttled.
   *
   * Sum over 5 minutes
   *
   * Default: sum over 5 minutes
   *
   * @param props
   */
  public fun metricThrottles(props: MetricOptions): Metric

  /**
   * Metric for the number of throttled invocations of this Lambda How often this Lambda is
   * throttled.
   *
   * Sum over 5 minutes
   *
   * Default: sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2c66b543d0ee791c9157b75f01987fb80ab6ef611d23006ace8925909dc84e3f")
  public fun metricThrottles(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The construct node where permissions are attached.
   */
  public fun permissionsNode(): Node

  /**
   * The ARN(s) to put into the resource field of the generated IAM policy for grantInvoke().
   *
   * This property is for cdk modules to consume only. You should not need to use this property.
   * Instead, use grantInvoke() directly.
   */
  public fun resourceArnsForGrantInvoke(): List<String>

  /**
   * The IAM role associated with this function.
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.IFunction): IFunction =
        CdkObjectWrappers.wrap(cdkObject) as IFunction

    internal fun unwrap(wrapped: IFunction): software.amazon.awscdk.services.lambda.IFunction =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.lambda.IFunction
  }
}
