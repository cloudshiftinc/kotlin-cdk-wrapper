@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pinpoint

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnEventStreamProps {
  public fun applicationId(): String

  public fun destinationStreamArn(): String

  public fun roleArn(): String

  @CdkDslMarker
  public interface Builder {
    public fun applicationId(applicationId: String)

    public fun destinationStreamArn(destinationStreamArn: String)

    public fun roleArn(roleArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnEventStreamProps.Builder =
        software.amazon.awscdk.services.pinpoint.CfnEventStreamProps.builder()

    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    override fun destinationStreamArn(destinationStreamArn: String) {
      cdkBuilder.destinationStreamArn(destinationStreamArn)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnEventStreamProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.pinpoint.CfnEventStreamProps,
  ) : CdkObject(cdkObject), CfnEventStreamProps {
    override fun applicationId(): String = unwrap(this).getApplicationId()

    override fun destinationStreamArn(): String = unwrap(this).getDestinationStreamArn()

    override fun roleArn(): String = unwrap(this).getRoleArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEventStreamProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnEventStreamProps):
        CfnEventStreamProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEventStreamProps):
        software.amazon.awscdk.services.pinpoint.CfnEventStreamProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.pinpoint.CfnEventStreamProps
  }
}
