@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.customresources

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import io.cloudshiftdev.awscdk.services.logs.RetentionDays
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface AwsCustomResourceProps {
  public fun functionName(): String? = unwrap(this).getFunctionName()

  public fun installLatestAwsSdk(): Boolean? = unwrap(this).getInstallLatestAwsSdk()

  public fun logGroup(): ILogGroup? = unwrap(this).getLogGroup()?.let(ILogGroup::wrap)

  public fun logRetention(): RetentionDays? =
      unwrap(this).getLogRetention()?.let(RetentionDays::wrap)

  public fun onCreate(): AwsSdkCall? = unwrap(this).getOnCreate()?.let(AwsSdkCall::wrap)

  public fun onDelete(): AwsSdkCall? = unwrap(this).getOnDelete()?.let(AwsSdkCall::wrap)

  public fun onUpdate(): AwsSdkCall? = unwrap(this).getOnUpdate()?.let(AwsSdkCall::wrap)

  public fun policy(): AwsCustomResourcePolicy? =
      unwrap(this).getPolicy()?.let(AwsCustomResourcePolicy::wrap)

  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  public fun resourceType(): String? = unwrap(this).getResourceType()

  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  public fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  public fun vpcSubnets(): SubnetSelection? =
      unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun functionName(functionName: String)

    public fun installLatestAwsSdk(installLatestAwsSdk: Boolean)

    public fun logGroup(logGroup: ILogGroup)

    public fun logRetention(logRetention: RetentionDays)

    public fun onCreate(onCreate: AwsSdkCall)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b7d83925f337400070b058c2c5817eece64b7025dff0d1cdce207b715ed8e0c")
    public fun onCreate(onCreate: AwsSdkCall.Builder.() -> Unit)

    public fun onDelete(onDelete: AwsSdkCall)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("522a51155d300c6e37ace685101570bb5db0cf50484ddb88b9a883cda34b7119")
    public fun onDelete(onDelete: AwsSdkCall.Builder.() -> Unit)

    public fun onUpdate(onUpdate: AwsSdkCall)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a1afa3e515eeaa39eec57853b1d14153b0442e69efc9058fa081bf9457e55c45")
    public fun onUpdate(onUpdate: AwsSdkCall.Builder.() -> Unit)

    public fun policy(policy: AwsCustomResourcePolicy)

    public fun removalPolicy(removalPolicy: RemovalPolicy)

    public fun resourceType(resourceType: String)

    public fun role(role: IRole)

    public fun timeout(timeout: Duration)

    public fun vpc(vpc: IVpc)

    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7df7ab27452084b6d7cc3d2d4fb67c130943ba890527bd12a3aebd90994a8fa9")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.customresources.AwsCustomResourceProps.Builder =
        software.amazon.awscdk.customresources.AwsCustomResourceProps.builder()

    override fun functionName(functionName: String) {
      cdkBuilder.functionName(functionName)
    }

    override fun installLatestAwsSdk(installLatestAwsSdk: Boolean) {
      cdkBuilder.installLatestAwsSdk(installLatestAwsSdk)
    }

    override fun logGroup(logGroup: ILogGroup) {
      cdkBuilder.logGroup(logGroup.let(ILogGroup::unwrap))
    }

    override fun logRetention(logRetention: RetentionDays) {
      cdkBuilder.logRetention(logRetention.let(RetentionDays::unwrap))
    }

    override fun onCreate(onCreate: AwsSdkCall) {
      cdkBuilder.onCreate(onCreate.let(AwsSdkCall::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b7d83925f337400070b058c2c5817eece64b7025dff0d1cdce207b715ed8e0c")
    override fun onCreate(onCreate: AwsSdkCall.Builder.() -> Unit): Unit =
        onCreate(AwsSdkCall(onCreate))

    override fun onDelete(onDelete: AwsSdkCall) {
      cdkBuilder.onDelete(onDelete.let(AwsSdkCall::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("522a51155d300c6e37ace685101570bb5db0cf50484ddb88b9a883cda34b7119")
    override fun onDelete(onDelete: AwsSdkCall.Builder.() -> Unit): Unit =
        onDelete(AwsSdkCall(onDelete))

    override fun onUpdate(onUpdate: AwsSdkCall) {
      cdkBuilder.onUpdate(onUpdate.let(AwsSdkCall::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a1afa3e515eeaa39eec57853b1d14153b0442e69efc9058fa081bf9457e55c45")
    override fun onUpdate(onUpdate: AwsSdkCall.Builder.() -> Unit): Unit =
        onUpdate(AwsSdkCall(onUpdate))

    override fun policy(policy: AwsCustomResourcePolicy) {
      cdkBuilder.policy(policy.let(AwsCustomResourcePolicy::unwrap))
    }

    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    override fun resourceType(resourceType: String) {
      cdkBuilder.resourceType(resourceType)
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7df7ab27452084b6d7cc3d2d4fb67c130943ba890527bd12a3aebd90994a8fa9")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.customresources.AwsCustomResourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.customresources.AwsCustomResourceProps,
  ) : CdkObject(cdkObject), AwsCustomResourceProps {
    override fun functionName(): String? = unwrap(this).getFunctionName()

    override fun installLatestAwsSdk(): Boolean? = unwrap(this).getInstallLatestAwsSdk()

    override fun logGroup(): ILogGroup? = unwrap(this).getLogGroup()?.let(ILogGroup::wrap)

    override fun logRetention(): RetentionDays? =
        unwrap(this).getLogRetention()?.let(RetentionDays::wrap)

    override fun onCreate(): AwsSdkCall? = unwrap(this).getOnCreate()?.let(AwsSdkCall::wrap)

    override fun onDelete(): AwsSdkCall? = unwrap(this).getOnDelete()?.let(AwsSdkCall::wrap)

    override fun onUpdate(): AwsSdkCall? = unwrap(this).getOnUpdate()?.let(AwsSdkCall::wrap)

    override fun policy(): AwsCustomResourcePolicy? =
        unwrap(this).getPolicy()?.let(AwsCustomResourcePolicy::wrap)

    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

    override fun resourceType(): String? = unwrap(this).getResourceType()

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

    override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AwsCustomResourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.customresources.AwsCustomResourceProps):
        AwsCustomResourceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AwsCustomResourceProps):
        software.amazon.awscdk.customresources.AwsCustomResourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.customresources.AwsCustomResourceProps
  }
}
