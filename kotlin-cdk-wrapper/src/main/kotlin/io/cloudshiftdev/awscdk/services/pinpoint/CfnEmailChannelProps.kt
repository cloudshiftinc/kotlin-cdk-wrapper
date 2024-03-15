@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pinpoint

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface CfnEmailChannelProps {
  public fun applicationId(): String

  public fun configurationSet(): String? = unwrap(this).getConfigurationSet()

  public fun enabled(): Any? = unwrap(this).getEnabled()

  public fun fromAddress(): String

  public fun identity(): String

  public fun roleArn(): String? = unwrap(this).getRoleArn()

  @CdkDslMarker
  public interface Builder {
    public fun applicationId(applicationId: String)

    public fun configurationSet(configurationSet: String)

    public fun enabled(enabled: Boolean)

    public fun enabled(enabled: IResolvable)

    public fun fromAddress(fromAddress: String)

    public fun identity(identity: String)

    public fun roleArn(roleArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnEmailChannelProps.Builder =
        software.amazon.awscdk.services.pinpoint.CfnEmailChannelProps.builder()

    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    override fun configurationSet(configurationSet: String) {
      cdkBuilder.configurationSet(configurationSet)
    }

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    override fun fromAddress(fromAddress: String) {
      cdkBuilder.fromAddress(fromAddress)
    }

    override fun identity(identity: String) {
      cdkBuilder.identity(identity)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnEmailChannelProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.pinpoint.CfnEmailChannelProps,
  ) : CdkObject(cdkObject), CfnEmailChannelProps {
    override fun applicationId(): String = unwrap(this).getApplicationId()

    override fun configurationSet(): String? = unwrap(this).getConfigurationSet()

    override fun enabled(): Any? = unwrap(this).getEnabled()

    override fun fromAddress(): String = unwrap(this).getFromAddress()

    override fun identity(): String = unwrap(this).getIdentity()

    override fun roleArn(): String? = unwrap(this).getRoleArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEmailChannelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnEmailChannelProps):
        CfnEmailChannelProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEmailChannelProps):
        software.amazon.awscdk.services.pinpoint.CfnEmailChannelProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.pinpoint.CfnEmailChannelProps
  }
}
