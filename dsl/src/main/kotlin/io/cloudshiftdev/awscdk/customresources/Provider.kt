package io.cloudshiftdev.awscdk.customresources

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import io.cloudshiftdev.awscdk.services.logs.RetentionDays
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Provider internal constructor(
  private val cdkObject: software.amazon.awscdk.customresources.Provider,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  public open fun isCompleteHandler(): IFunction? =
      unwrap(this).getIsCompleteHandler()?.let(IFunction::wrap)

  public open fun onEventHandler(): IFunction =
      unwrap(this).getOnEventHandler().let(IFunction::wrap)

  public open fun serviceToken(): String = unwrap(this).getServiceToken()

  public interface Builder {
    public fun isCompleteHandler(isCompleteHandler: IFunction)

    public fun logGroup(logGroup: ILogGroup)

    public fun logRetention(logRetention: RetentionDays)

    public fun onEventHandler(onEventHandler: IFunction)

    public fun providerFunctionEnvEncryption(providerFunctionEnvEncryption: IKey)

    public fun providerFunctionName(providerFunctionName: String)

    public fun queryInterval(queryInterval: Duration)

    public fun role(role: IRole)

    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    public fun totalTimeout(totalTimeout: Duration)

    public fun vpc(vpc: IVpc)

    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("84e3de72b4de6337b5fc519d0175efa34e4a5db977bc917b683cf8312d37469b")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.customresources.Provider.Builder =
        software.amazon.awscdk.customresources.Provider.Builder.create(scope, id)

    override fun isCompleteHandler(isCompleteHandler: IFunction) {
      cdkBuilder.isCompleteHandler(isCompleteHandler.let(IFunction::unwrap))
    }

    override fun logGroup(logGroup: ILogGroup) {
      cdkBuilder.logGroup(logGroup.let(ILogGroup::unwrap))
    }

    override fun logRetention(logRetention: RetentionDays) {
      cdkBuilder.logRetention(logRetention.let(RetentionDays::unwrap))
    }

    override fun onEventHandler(onEventHandler: IFunction) {
      cdkBuilder.onEventHandler(onEventHandler.let(IFunction::unwrap))
    }

    override fun providerFunctionEnvEncryption(providerFunctionEnvEncryption: IKey) {
      cdkBuilder.providerFunctionEnvEncryption(providerFunctionEnvEncryption.let(IKey::unwrap))
    }

    override fun providerFunctionName(providerFunctionName: String) {
      cdkBuilder.providerFunctionName(providerFunctionName)
    }

    override fun queryInterval(queryInterval: Duration) {
      cdkBuilder.queryInterval(queryInterval.let(Duration::unwrap))
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    override fun totalTimeout(totalTimeout: Duration) {
      cdkBuilder.totalTimeout(totalTimeout.let(Duration::unwrap))
    }

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("84e3de72b4de6337b5fc519d0175efa34e4a5db977bc917b683cf8312d37469b")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.customresources.Provider = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Provider {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Provider(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.customresources.Provider): Provider =
        Provider(cdkObject)

    internal fun unwrap(wrapped: Provider): software.amazon.awscdk.customresources.Provider =
        wrapped.cdkObject
  }
}
