@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkObject
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

public abstract class FunctionBase internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.lambda.FunctionBase,
) : Resource(cdkObject), IFunction, IClientVpnConnectionHandler {
  public override fun addEventSource(source: IEventSource) {
    unwrap(this).addEventSource(source.let(IEventSource::unwrap))
  }

  public override fun addEventSourceMapping(id: String, options: EventSourceMappingOptions):
      EventSourceMapping = unwrap(this).addEventSourceMapping(id,
      options.let(EventSourceMappingOptions::unwrap)).let(EventSourceMapping::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e1a42ee4d3635728f011b89020cb9e266d5ec086cc3638388b952c384adc89b9")
  public override fun addEventSourceMapping(id: String,
      options: EventSourceMappingOptions.Builder.() -> Unit): EventSourceMapping =
      addEventSourceMapping(id, EventSourceMappingOptions(options))

  public override fun addFunctionUrl(): FunctionUrl =
      unwrap(this).addFunctionUrl().let(FunctionUrl::wrap)

  public override fun addFunctionUrl(options: FunctionUrlOptions): FunctionUrl =
      unwrap(this).addFunctionUrl(options.let(FunctionUrlOptions::unwrap)).let(FunctionUrl::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bc489a994cc127e25ae321702e1246a654ec80f2c2c2c9c9399e6bdb53dab162")
  public override fun addFunctionUrl(options: FunctionUrlOptions.Builder.() -> Unit): FunctionUrl =
      addFunctionUrl(FunctionUrlOptions(options))

  public override fun addPermission(id: String, permission: Permission) {
    unwrap(this).addPermission(id, permission.let(Permission::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ab1e13b50521b14748449d1cedaddd4f97568ffa4bbbeb7d2cea25e84b0ce6c2")
  public override fun addPermission(id: String, permission: Permission.Builder.() -> Unit): Unit =
      addPermission(id, Permission(permission))

  public override fun addToRolePolicy(statement: PolicyStatement) {
    unwrap(this).addToRolePolicy(statement.let(PolicyStatement::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ccef0414b9292b425848f90820fb8748386b8cf1c85b1012acc59056410c2329")
  public override fun addToRolePolicy(statement: PolicyStatement.Builder.() -> Unit): Unit =
      addToRolePolicy(PolicyStatement(statement))

  public override fun architecture(): Architecture =
      unwrap(this).getArchitecture().let(Architecture::wrap)

  public override fun configureAsyncInvoke(options: EventInvokeConfigOptions) {
    unwrap(this).configureAsyncInvoke(options.let(EventInvokeConfigOptions::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b85c1a6f6a657150d5fca517e75d094e687b3217c04d318f2be78e23e7c059ee")
  public override fun configureAsyncInvoke(options: EventInvokeConfigOptions.Builder.() -> Unit):
      Unit = configureAsyncInvoke(EventInvokeConfigOptions(options))

  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  public open fun considerWarningOnInvokeFunctionPermissions(scope: Construct, action: String) {
    unwrap(this).considerWarningOnInvokeFunctionPermissions(scope.let(Construct::unwrap), action)
  }

  public override fun functionArn(): String = unwrap(this).getFunctionArn()

  public override fun functionName(): String = unwrap(this).getFunctionName()

  public override fun grantInvoke(grantee: IGrantable): Grant =
      unwrap(this).grantInvoke(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun grantInvokeCompositePrincipal(compositePrincipal: CompositePrincipal):
      List<Grant> =
      unwrap(this).grantInvokeCompositePrincipal(compositePrincipal.let(CompositePrincipal::unwrap)).map(Grant::wrap)

  public override fun grantInvokeUrl(grantee: IGrantable): Grant =
      unwrap(this).grantInvokeUrl(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun grantPrincipal(): IPrincipal =
      unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

  public override fun isBoundToVpc(): Boolean = unwrap(this).getIsBoundToVpc()

  public override fun latestVersion(): IVersion =
      unwrap(this).getLatestVersion().let(IVersion::wrap)

  public override fun metric(metricName: String): Metric =
      unwrap(this).metric(metricName).let(Metric::wrap)

  public override fun metric(metricName: String, props: MetricOptions): Metric =
      unwrap(this).metric(metricName, props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public override fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
      metric(metricName, MetricOptions(props))

  public override fun metricDuration(): Metric = unwrap(this).metricDuration().let(Metric::wrap)

  public override fun metricDuration(props: MetricOptions): Metric =
      unwrap(this).metricDuration(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4ea8a7b75f617289e62bb7a84f391e0dfba5ed29384b388b6af080b47b00e619")
  public override fun metricDuration(props: MetricOptions.Builder.() -> Unit): Metric =
      metricDuration(MetricOptions(props))

  public override fun metricErrors(): Metric = unwrap(this).metricErrors().let(Metric::wrap)

  public override fun metricErrors(props: MetricOptions): Metric =
      unwrap(this).metricErrors(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("35a6413eeb4163b1b71b829794e56c9dcdd5a733bbb4fad94ee2cb3a0267d941")
  public override fun metricErrors(props: MetricOptions.Builder.() -> Unit): Metric =
      metricErrors(MetricOptions(props))

  public override fun metricInvocations(): Metric =
      unwrap(this).metricInvocations().let(Metric::wrap)

  public override fun metricInvocations(props: MetricOptions): Metric =
      unwrap(this).metricInvocations(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6a03faa9f4e6ab06d879372d43628c35937b122c9853c734195167cad56a2614")
  public override fun metricInvocations(props: MetricOptions.Builder.() -> Unit): Metric =
      metricInvocations(MetricOptions(props))

  public override fun metricThrottles(): Metric = unwrap(this).metricThrottles().let(Metric::wrap)

  public override fun metricThrottles(props: MetricOptions): Metric =
      unwrap(this).metricThrottles(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2c66b543d0ee791c9157b75f01987fb80ab6ef611d23006ace8925909dc84e3f")
  public override fun metricThrottles(props: MetricOptions.Builder.() -> Unit): Metric =
      metricThrottles(MetricOptions(props))

  public override fun permissionsNode(): Node = unwrap(this).getPermissionsNode().let(Node::wrap)

  public override fun resourceArnsForGrantInvoke(): List<String> =
      unwrap(this).getResourceArnsForGrantInvoke()

  public override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.FunctionBase,
  ) : FunctionBase(cdkObject)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.FunctionBase): FunctionBase
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FunctionBase): software.amazon.awscdk.services.lambda.FunctionBase
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.lambda.FunctionBase
  }
}
