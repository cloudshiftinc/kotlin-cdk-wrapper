package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.iam.CompositePrincipal
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.constructs.Node
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface IAlias : IFunction {
  public fun aliasName(): String

  public fun version(): IVersion

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.lambda.IAlias,
  ) : IAlias {
    public override fun addEventSource(arg0: IEventSource) {
      unwrap(this).addEventSource(arg0.let(IEventSource::unwrap))
    }

    public override fun addEventSourceMapping(arg0: String, arg1: EventSourceMappingOptions):
        EventSourceMapping = unwrap(this).addEventSourceMapping(arg0,
        arg1.let(EventSourceMappingOptions::unwrap)).let(EventSourceMapping::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e1a42ee4d3635728f011b89020cb9e266d5ec086cc3638388b952c384adc89b9")
    public override fun addEventSourceMapping(arg0: String,
        arg1: EventSourceMappingOptions.Builder.() -> Unit): EventSourceMapping =
        addEventSourceMapping(arg0, EventSourceMappingOptions(arg1))

    public override fun addFunctionUrl(): FunctionUrl =
        unwrap(this).addFunctionUrl().let(FunctionUrl::wrap)

    public override fun addFunctionUrl(arg0: FunctionUrlOptions): FunctionUrl =
        unwrap(this).addFunctionUrl(arg0.let(FunctionUrlOptions::unwrap)).let(FunctionUrl::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bc489a994cc127e25ae321702e1246a654ec80f2c2c2c9c9399e6bdb53dab162")
    public override fun addFunctionUrl(arg0: FunctionUrlOptions.Builder.() -> Unit): FunctionUrl =
        addFunctionUrl(FunctionUrlOptions(arg0))

    public override fun addPermission(arg0: String, arg1: Permission) {
      unwrap(this).addPermission(arg0, arg1.let(Permission::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab1e13b50521b14748449d1cedaddd4f97568ffa4bbbeb7d2cea25e84b0ce6c2")
    public override fun addPermission(arg0: String, arg1: Permission.Builder.() -> Unit): Unit =
        addPermission(arg0, Permission(arg1))

    public override fun addToRolePolicy(arg0: PolicyStatement) {
      unwrap(this).addToRolePolicy(arg0.let(PolicyStatement::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ccef0414b9292b425848f90820fb8748386b8cf1c85b1012acc59056410c2329")
    public override fun addToRolePolicy(arg0: PolicyStatement.Builder.() -> Unit): Unit =
        addToRolePolicy(PolicyStatement(arg0))

    public override fun aliasName(): String = unwrap(this).getAliasName()

    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun architecture(): Architecture =
        unwrap(this).getArchitecture().let(Architecture::wrap)

    public override fun configureAsyncInvoke(arg0: EventInvokeConfigOptions) {
      unwrap(this).configureAsyncInvoke(arg0.let(EventInvokeConfigOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b85c1a6f6a657150d5fca517e75d094e687b3217c04d318f2be78e23e7c059ee")
    public override fun configureAsyncInvoke(arg0: EventInvokeConfigOptions.Builder.() -> Unit):
        Unit = configureAsyncInvoke(EventInvokeConfigOptions(arg0))

    public override fun connections(): Connections =
        unwrap(this).getConnections().let(Connections::wrap)

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun functionArn(): String = unwrap(this).getFunctionArn()

    public override fun functionName(): String = unwrap(this).getFunctionName()

    public override fun grantInvoke(arg0: IGrantable): Grant =
        unwrap(this).grantInvoke(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    public override fun grantInvokeCompositePrincipal(arg0: CompositePrincipal): List<Grant> =
        unwrap(this).grantInvokeCompositePrincipal(arg0.let(CompositePrincipal::unwrap)).map(Grant::wrap)

    public override fun grantInvokeUrl(arg0: IGrantable): Grant =
        unwrap(this).grantInvokeUrl(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    public override fun grantPrincipal(): IPrincipal =
        unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

    public override fun isBoundToVpc(): Boolean = unwrap(this).getIsBoundToVpc()

    public override fun latestVersion(): IVersion =
        unwrap(this).getLatestVersion().let(IVersion::wrap)

    public override fun metric(arg0: String): Metric = unwrap(this).metric(arg0).let(Metric::wrap)

    public override fun metric(arg0: String, arg1: MetricOptions): Metric =
        unwrap(this).metric(arg0, arg1.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
    public override fun metric(arg0: String, arg1: MetricOptions.Builder.() -> Unit): Metric =
        metric(arg0, MetricOptions(arg1))

    public override fun metricDuration(): Metric = unwrap(this).metricDuration().let(Metric::wrap)

    public override fun metricDuration(arg0: MetricOptions): Metric =
        unwrap(this).metricDuration(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4ea8a7b75f617289e62bb7a84f391e0dfba5ed29384b388b6af080b47b00e619")
    public override fun metricDuration(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricDuration(MetricOptions(arg0))

    public override fun metricErrors(): Metric = unwrap(this).metricErrors().let(Metric::wrap)

    public override fun metricErrors(arg0: MetricOptions): Metric =
        unwrap(this).metricErrors(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("35a6413eeb4163b1b71b829794e56c9dcdd5a733bbb4fad94ee2cb3a0267d941")
    public override fun metricErrors(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricErrors(MetricOptions(arg0))

    public override fun metricInvocations(): Metric =
        unwrap(this).metricInvocations().let(Metric::wrap)

    public override fun metricInvocations(arg0: MetricOptions): Metric =
        unwrap(this).metricInvocations(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6a03faa9f4e6ab06d879372d43628c35937b122c9853c734195167cad56a2614")
    public override fun metricInvocations(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricInvocations(MetricOptions(arg0))

    public override fun metricThrottles(): Metric = unwrap(this).metricThrottles().let(Metric::wrap)

    public override fun metricThrottles(arg0: MetricOptions): Metric =
        unwrap(this).metricThrottles(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c66b543d0ee791c9157b75f01987fb80ab6ef611d23006ace8925909dc84e3f")
    public override fun metricThrottles(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricThrottles(MetricOptions(arg0))

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun permissionsNode(): Node = unwrap(this).getPermissionsNode().let(Node::wrap)

    public override fun resourceArnsForGrantInvoke(): List<String> =
        unwrap(this).getResourceArnsForGrantInvoke() ?: emptyList()

    public override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    public override fun version(): IVersion = unwrap(this).getVersion().let(IVersion::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.IAlias): IAlias =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IAlias): software.amazon.awscdk.services.lambda.IAlias = (wrapped
        as Wrapper).cdkObject
  }
}
