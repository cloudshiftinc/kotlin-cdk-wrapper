@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.emr

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnStudioSessionMappingProps {
  public fun identityName(): String

  public fun identityType(): String

  public fun sessionPolicyArn(): String

  public fun studioId(): String

  @CdkDslMarker
  public interface Builder {
    public fun identityName(identityName: String)

    public fun identityType(identityType: String)

    public fun sessionPolicyArn(sessionPolicyArn: String)

    public fun studioId(studioId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.emr.CfnStudioSessionMappingProps.Builder
        = software.amazon.awscdk.services.emr.CfnStudioSessionMappingProps.builder()

    override fun identityName(identityName: String) {
      cdkBuilder.identityName(identityName)
    }

    override fun identityType(identityType: String) {
      cdkBuilder.identityType(identityType)
    }

    override fun sessionPolicyArn(sessionPolicyArn: String) {
      cdkBuilder.sessionPolicyArn(sessionPolicyArn)
    }

    override fun studioId(studioId: String) {
      cdkBuilder.studioId(studioId)
    }

    public fun build(): software.amazon.awscdk.services.emr.CfnStudioSessionMappingProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.emr.CfnStudioSessionMappingProps,
  ) : CdkObject(cdkObject), CfnStudioSessionMappingProps {
    override fun identityName(): String = unwrap(this).getIdentityName()

    override fun identityType(): String = unwrap(this).getIdentityType()

    override fun sessionPolicyArn(): String = unwrap(this).getSessionPolicyArn()

    override fun studioId(): String = unwrap(this).getStudioId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStudioSessionMappingProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnStudioSessionMappingProps):
        CfnStudioSessionMappingProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStudioSessionMappingProps):
        software.amazon.awscdk.services.emr.CfnStudioSessionMappingProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.emr.CfnStudioSessionMappingProps
  }
}
