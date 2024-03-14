package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface AttachInitOptions {
  public fun configSets(): List<String> = unwrap(this).getConfigSets() ?: emptyList()

  public fun embedFingerprint(): Boolean? = unwrap(this).getEmbedFingerprint()

  public fun ignoreFailures(): Boolean? = unwrap(this).getIgnoreFailures()

  public fun includeRole(): Boolean? = unwrap(this).getIncludeRole()

  public fun includeUrl(): Boolean? = unwrap(this).getIncludeUrl()

  public fun instanceRole(): IRole

  public fun platform(): OperatingSystemType

  public fun printLog(): Boolean? = unwrap(this).getPrintLog()

  public fun signalResource(): CfnResource? =
      unwrap(this).getSignalResource()?.let(CfnResource::wrap)

  public fun userData(): UserData

  public interface Builder {
    public fun configSets(configSets: List<String>) {
    }

    public fun embedFingerprint(embedFingerprint: Boolean) {
    }

    public fun ignoreFailures(ignoreFailures: Boolean) {
    }

    public fun includeRole(includeRole: Boolean) {
    }

    public fun includeUrl(includeUrl: Boolean) {
    }

    public fun instanceRole(instanceRole: IRole) {
    }

    public fun platform(platform: OperatingSystemType) {
    }

    public fun printLog(printLog: Boolean) {
    }

    public fun signalResource(signalResource: CfnResource) {
    }

    public fun userData(userData: UserData) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.AttachInitOptions.Builder =
        software.amazon.awscdk.services.ec2.AttachInitOptions.builder()

    public override fun configSets(configSets: List<String>) {
      cdkBuilder.configSets(configSets)
    }

    public override fun embedFingerprint(embedFingerprint: Boolean) {
      cdkBuilder.embedFingerprint(embedFingerprint)
    }

    public override fun ignoreFailures(ignoreFailures: Boolean) {
      cdkBuilder.ignoreFailures(ignoreFailures)
    }

    public override fun includeRole(includeRole: Boolean) {
      cdkBuilder.includeRole(includeRole)
    }

    public override fun includeUrl(includeUrl: Boolean) {
      cdkBuilder.includeUrl(includeUrl)
    }

    public override fun instanceRole(instanceRole: IRole) {
      cdkBuilder.instanceRole(instanceRole.let(IRole::unwrap))
    }

    public override fun platform(platform: OperatingSystemType) {
      cdkBuilder.platform(platform.let(OperatingSystemType::unwrap))
    }

    public override fun printLog(printLog: Boolean) {
      cdkBuilder.printLog(printLog)
    }

    public override fun signalResource(signalResource: CfnResource) {
      cdkBuilder.signalResource(signalResource.let(CfnResource::unwrap))
    }

    public override fun userData(userData: UserData) {
      cdkBuilder.userData(userData.let(UserData::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.AttachInitOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.AttachInitOptions,
  ) : AttachInitOptions {
    public override fun configSets(): List<String> = unwrap(this).getConfigSets() ?: emptyList()

    public override fun embedFingerprint(): Boolean? = unwrap(this).getEmbedFingerprint()

    public override fun ignoreFailures(): Boolean? = unwrap(this).getIgnoreFailures()

    public override fun includeRole(): Boolean? = unwrap(this).getIncludeRole()

    public override fun includeUrl(): Boolean? = unwrap(this).getIncludeUrl()

    public override fun instanceRole(): IRole = unwrap(this).getInstanceRole().let(IRole::wrap)

    public override fun platform(): OperatingSystemType =
        unwrap(this).getPlatform().let(OperatingSystemType::wrap)

    public override fun printLog(): Boolean? = unwrap(this).getPrintLog()

    public override fun signalResource(): CfnResource? =
        unwrap(this).getSignalResource()?.let(CfnResource::wrap)

    public override fun userData(): UserData = unwrap(this).getUserData().let(UserData::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AttachInitOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AttachInitOptions):
        AttachInitOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AttachInitOptions):
        software.amazon.awscdk.services.ec2.AttachInitOptions = (wrapped as Wrapper).cdkObject
  }
}
