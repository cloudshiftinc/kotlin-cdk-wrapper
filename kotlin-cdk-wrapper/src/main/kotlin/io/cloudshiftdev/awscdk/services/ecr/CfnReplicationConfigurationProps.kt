@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecr

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnReplicationConfigurationProps {
  public fun replicationConfiguration(): Any

  @CdkDslMarker
  public interface Builder {
    public fun replicationConfiguration(replicationConfiguration: IResolvable)

    public
        fun replicationConfiguration(replicationConfiguration: CfnReplicationConfiguration.ReplicationConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("199bcc0a2a6285e92bfced090c98e4d70aff02983be0b96bc3ba27bf74be0dbe")
    public
        fun replicationConfiguration(replicationConfiguration: CfnReplicationConfiguration.ReplicationConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecr.CfnReplicationConfigurationProps.Builder =
        software.amazon.awscdk.services.ecr.CfnReplicationConfigurationProps.builder()

    override fun replicationConfiguration(replicationConfiguration: IResolvable) {
      cdkBuilder.replicationConfiguration(replicationConfiguration.let(IResolvable::unwrap))
    }

    override
        fun replicationConfiguration(replicationConfiguration: CfnReplicationConfiguration.ReplicationConfigurationProperty) {
      cdkBuilder.replicationConfiguration(replicationConfiguration.let(CfnReplicationConfiguration.ReplicationConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("199bcc0a2a6285e92bfced090c98e4d70aff02983be0b96bc3ba27bf74be0dbe")
    override
        fun replicationConfiguration(replicationConfiguration: CfnReplicationConfiguration.ReplicationConfigurationProperty.Builder.() -> Unit):
        Unit =
        replicationConfiguration(CfnReplicationConfiguration.ReplicationConfigurationProperty(replicationConfiguration))

    public fun build(): software.amazon.awscdk.services.ecr.CfnReplicationConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecr.CfnReplicationConfigurationProps,
  ) : CdkObject(cdkObject), CfnReplicationConfigurationProps {
    override fun replicationConfiguration(): Any = unwrap(this).getReplicationConfiguration()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnReplicationConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecr.CfnReplicationConfigurationProps):
        CfnReplicationConfigurationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnReplicationConfigurationProps):
        software.amazon.awscdk.services.ecr.CfnReplicationConfigurationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecr.CfnReplicationConfigurationProps
  }
}
