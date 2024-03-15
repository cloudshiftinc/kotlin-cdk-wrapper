@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datasync

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnStorageSystemProps {
  public fun agentArns(): List<String>

  public fun cloudWatchLogGroupArn(): String? = unwrap(this).getCloudWatchLogGroupArn()

  public fun name(): String? = unwrap(this).getName()

  public fun serverConfiguration(): Any

  public fun serverCredentials(): Any? = unwrap(this).getServerCredentials()

  public fun systemType(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun agentArns(agentArns: List<String>)

    public fun agentArns(vararg agentArns: String)

    public fun cloudWatchLogGroupArn(cloudWatchLogGroupArn: String)

    public fun name(name: String)

    public fun serverConfiguration(serverConfiguration: IResolvable)

    public
        fun serverConfiguration(serverConfiguration: CfnStorageSystem.ServerConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f546866c99d0d31dec9da1a0a4281857c386f71ad94e0c8d9b56fe7dbaaaadcb")
    public
        fun serverConfiguration(serverConfiguration: CfnStorageSystem.ServerConfigurationProperty.Builder.() -> Unit)

    public fun serverCredentials(serverCredentials: IResolvable)

    public fun serverCredentials(serverCredentials: CfnStorageSystem.ServerCredentialsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("de6f4601e88f63dca973f40e13ae32cc4dffa79eb470c75e144b0cc564c4bde5")
    public
        fun serverCredentials(serverCredentials: CfnStorageSystem.ServerCredentialsProperty.Builder.() -> Unit)

    public fun systemType(systemType: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datasync.CfnStorageSystemProps.Builder =
        software.amazon.awscdk.services.datasync.CfnStorageSystemProps.builder()

    override fun agentArns(agentArns: List<String>) {
      cdkBuilder.agentArns(agentArns)
    }

    override fun agentArns(vararg agentArns: String): Unit = agentArns(agentArns.toList())

    override fun cloudWatchLogGroupArn(cloudWatchLogGroupArn: String) {
      cdkBuilder.cloudWatchLogGroupArn(cloudWatchLogGroupArn)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun serverConfiguration(serverConfiguration: IResolvable) {
      cdkBuilder.serverConfiguration(serverConfiguration.let(IResolvable::unwrap))
    }

    override
        fun serverConfiguration(serverConfiguration: CfnStorageSystem.ServerConfigurationProperty) {
      cdkBuilder.serverConfiguration(serverConfiguration.let(CfnStorageSystem.ServerConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f546866c99d0d31dec9da1a0a4281857c386f71ad94e0c8d9b56fe7dbaaaadcb")
    override
        fun serverConfiguration(serverConfiguration: CfnStorageSystem.ServerConfigurationProperty.Builder.() -> Unit):
        Unit =
        serverConfiguration(CfnStorageSystem.ServerConfigurationProperty(serverConfiguration))

    override fun serverCredentials(serverCredentials: IResolvable) {
      cdkBuilder.serverCredentials(serverCredentials.let(IResolvable::unwrap))
    }

    override fun serverCredentials(serverCredentials: CfnStorageSystem.ServerCredentialsProperty) {
      cdkBuilder.serverCredentials(serverCredentials.let(CfnStorageSystem.ServerCredentialsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("de6f4601e88f63dca973f40e13ae32cc4dffa79eb470c75e144b0cc564c4bde5")
    override
        fun serverCredentials(serverCredentials: CfnStorageSystem.ServerCredentialsProperty.Builder.() -> Unit):
        Unit = serverCredentials(CfnStorageSystem.ServerCredentialsProperty(serverCredentials))

    override fun systemType(systemType: String) {
      cdkBuilder.systemType(systemType)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.datasync.CfnStorageSystemProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.datasync.CfnStorageSystemProps,
  ) : CdkObject(cdkObject), CfnStorageSystemProps {
    override fun agentArns(): List<String> = unwrap(this).getAgentArns()

    override fun cloudWatchLogGroupArn(): String? = unwrap(this).getCloudWatchLogGroupArn()

    override fun name(): String? = unwrap(this).getName()

    override fun serverConfiguration(): Any = unwrap(this).getServerConfiguration()

    override fun serverCredentials(): Any? = unwrap(this).getServerCredentials()

    override fun systemType(): String = unwrap(this).getSystemType()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStorageSystemProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnStorageSystemProps):
        CfnStorageSystemProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStorageSystemProps):
        software.amazon.awscdk.services.datasync.CfnStorageSystemProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.datasync.CfnStorageSystemProps
  }
}
