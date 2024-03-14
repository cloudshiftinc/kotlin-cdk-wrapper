package io.cloudshiftdev.awscdk.services.emr

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnStudioSessionMapping internal constructor(
  private val cdkObject: software.amazon.awscdk.services.emr.CfnStudioSessionMapping,
) : CfnResource(cdkObject), IInspectable {
  public open fun identityName(): String = unwrap(this).getIdentityName()

  public open fun identityName(`value`: String) {
    unwrap(this).setIdentityName(`value`)
  }

  public open fun identityType(): String = unwrap(this).getIdentityType()

  public open fun identityType(`value`: String) {
    unwrap(this).setIdentityType(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun sessionPolicyArn(): String = unwrap(this).getSessionPolicyArn()

  public open fun sessionPolicyArn(`value`: String) {
    unwrap(this).setSessionPolicyArn(`value`)
  }

  public open fun studioId(): String = unwrap(this).getStudioId()

  public open fun studioId(`value`: String) {
    unwrap(this).setStudioId(`value`)
  }

  public interface Builder {
    public fun identityName(identityName: String)

    public fun identityType(identityType: String)

    public fun sessionPolicyArn(sessionPolicyArn: String)

    public fun studioId(studioId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.emr.CfnStudioSessionMapping.Builder =
        software.amazon.awscdk.services.emr.CfnStudioSessionMapping.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.emr.CfnStudioSessionMapping =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStudioSessionMapping {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStudioSessionMapping(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnStudioSessionMapping):
        CfnStudioSessionMapping = CfnStudioSessionMapping(cdkObject)

    internal fun unwrap(wrapped: CfnStudioSessionMapping):
        software.amazon.awscdk.services.emr.CfnStudioSessionMapping = wrapped.cdkObject
  }
}
