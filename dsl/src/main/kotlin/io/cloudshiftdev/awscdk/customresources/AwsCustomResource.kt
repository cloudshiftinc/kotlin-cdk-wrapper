package io.cloudshiftdev.awscdk.customresources

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Reference
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import io.cloudshiftdev.awscdk.services.logs.RetentionDays
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class AwsCustomResource internal constructor(
  private val cdkObject: software.amazon.awscdk.customresources.AwsCustomResource,
) : CloudshiftdevConstructsConstruct(cdkObject), IGrantable {
  public override fun grantPrincipal(): IPrincipal =
      unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

  public open fun responseField(dataPath: String): String = unwrap(this).getResponseField(dataPath)

  public open fun responseFieldReference(dataPath: String): Reference =
      unwrap(this).getResponseFieldReference(dataPath).let(Reference::wrap)

  public interface Builder {
    public fun functionName(functionName: String) {
    }

    public fun installLatestAwsSdk(installLatestAwsSdk: Boolean) {
    }

    public fun logGroup(logGroup: ILogGroup) {
    }

    public fun logRetention(logRetention: RetentionDays) {
    }

    public fun onCreate(onCreate: AwsSdkCall) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0abceb2a25226ed018ed77bc9067d5e666f441f9f7c8b30365b8ba71d382af32")
    public fun onCreate(onCreate: AwsSdkCall.Builder.() -> Unit) {
    }

    public fun onDelete(onDelete: AwsSdkCall) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("efb30bcba09a86be18f98a0f5ace3302a9a2b7655bc8409423acddb0fab3208d")
    public fun onDelete(onDelete: AwsSdkCall.Builder.() -> Unit) {
    }

    public fun onUpdate(onUpdate: AwsSdkCall) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b47349731bf7e943a6dc22393547fa8cfd7aa5ce1efd59b106715f42b7de03c")
    public fun onUpdate(onUpdate: AwsSdkCall.Builder.() -> Unit) {
    }

    public fun policy(policy: AwsCustomResourcePolicy) {
    }

    public fun removalPolicy(removalPolicy: RemovalPolicy) {
    }

    public fun resourceType(resourceType: String) {
    }

    public fun role(role: IRole) {
    }

    public fun timeout(timeout: Duration) {
    }

    public fun vpc(vpc: IVpc) {
    }

    public fun vpcSubnets(vpcSubnets: SubnetSelection) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("832e5764ad2889290b88a07eb3c204b7c910500a8ca75024237e0e7ba9fee539")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.customresources.AwsCustomResource.Builder =
        software.amazon.awscdk.customresources.AwsCustomResource.Builder.create(scope, id)

    public override fun functionName(functionName: String) {
      cdkBuilder.functionName(functionName)
    }

    public override fun installLatestAwsSdk(installLatestAwsSdk: Boolean) {
      cdkBuilder.installLatestAwsSdk(installLatestAwsSdk)
    }

    public override fun logGroup(logGroup: ILogGroup) {
      cdkBuilder.logGroup(logGroup.let(ILogGroup::unwrap))
    }

    public override fun logRetention(logRetention: RetentionDays) {
      cdkBuilder.logRetention(logRetention.let(RetentionDays::unwrap))
    }

    public override fun onCreate(onCreate: AwsSdkCall) {
      cdkBuilder.onCreate(onCreate.let(AwsSdkCall::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0abceb2a25226ed018ed77bc9067d5e666f441f9f7c8b30365b8ba71d382af32")
    public override fun onCreate(onCreate: AwsSdkCall.Builder.() -> Unit): Unit =
        onCreate(AwsSdkCall(onCreate))

    public override fun onDelete(onDelete: AwsSdkCall) {
      cdkBuilder.onDelete(onDelete.let(AwsSdkCall::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("efb30bcba09a86be18f98a0f5ace3302a9a2b7655bc8409423acddb0fab3208d")
    public override fun onDelete(onDelete: AwsSdkCall.Builder.() -> Unit): Unit =
        onDelete(AwsSdkCall(onDelete))

    public override fun onUpdate(onUpdate: AwsSdkCall) {
      cdkBuilder.onUpdate(onUpdate.let(AwsSdkCall::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b47349731bf7e943a6dc22393547fa8cfd7aa5ce1efd59b106715f42b7de03c")
    public override fun onUpdate(onUpdate: AwsSdkCall.Builder.() -> Unit): Unit =
        onUpdate(AwsSdkCall(onUpdate))

    public override fun policy(policy: AwsCustomResourcePolicy) {
      cdkBuilder.policy(policy.let(AwsCustomResourcePolicy::unwrap))
    }

    public override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    public override fun resourceType(resourceType: String) {
      cdkBuilder.resourceType(resourceType)
    }

    public override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    public override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("832e5764ad2889290b88a07eb3c204b7c910500a8ca75024237e0e7ba9fee539")
    public override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.customresources.AwsCustomResource =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): AwsCustomResource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return AwsCustomResource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.customresources.AwsCustomResource):
        AwsCustomResource = AwsCustomResource(cdkObject)

    internal fun unwrap(wrapped: AwsCustomResource):
        software.amazon.awscdk.customresources.AwsCustomResource = wrapped.cdkObject
  }
}
