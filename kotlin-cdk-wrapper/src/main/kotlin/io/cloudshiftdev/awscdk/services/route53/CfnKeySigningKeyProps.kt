@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnKeySigningKeyProps {
  public fun hostedZoneId(): String

  public fun keyManagementServiceArn(): String

  public fun name(): String

  public fun status(): String

  @CdkDslMarker
  public interface Builder {
    public fun hostedZoneId(hostedZoneId: String)

    public fun keyManagementServiceArn(keyManagementServiceArn: String)

    public fun name(name: String)

    public fun status(status: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.CfnKeySigningKeyProps.Builder =
        software.amazon.awscdk.services.route53.CfnKeySigningKeyProps.builder()

    override fun hostedZoneId(hostedZoneId: String) {
      cdkBuilder.hostedZoneId(hostedZoneId)
    }

    override fun keyManagementServiceArn(keyManagementServiceArn: String) {
      cdkBuilder.keyManagementServiceArn(keyManagementServiceArn)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    public fun build(): software.amazon.awscdk.services.route53.CfnKeySigningKeyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.route53.CfnKeySigningKeyProps,
  ) : CdkObject(cdkObject), CfnKeySigningKeyProps {
    override fun hostedZoneId(): String = unwrap(this).getHostedZoneId()

    override fun keyManagementServiceArn(): String = unwrap(this).getKeyManagementServiceArn()

    override fun name(): String = unwrap(this).getName()

    override fun status(): String = unwrap(this).getStatus()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnKeySigningKeyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnKeySigningKeyProps):
        CfnKeySigningKeyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnKeySigningKeyProps):
        software.amazon.awscdk.services.route53.CfnKeySigningKeyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.route53.CfnKeySigningKeyProps
  }
}
