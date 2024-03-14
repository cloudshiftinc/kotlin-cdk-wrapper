package io.cloudshiftdev.awscdk.services.macie

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSession internal constructor(
  private val cdkObject: software.amazon.awscdk.services.macie.CfnSession,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrAwsAccountId(): String = unwrap(this).getAttrAwsAccountId()

  public open fun attrServiceRole(): String = unwrap(this).getAttrServiceRole()

  public open fun findingPublishingFrequency(): String? =
      unwrap(this).getFindingPublishingFrequency()

  public open fun findingPublishingFrequency(`value`: String) {
    unwrap(this).setFindingPublishingFrequency(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun status(): String? = unwrap(this).getStatus()

  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  public interface Builder {
    public fun findingPublishingFrequency(findingPublishingFrequency: String)

    public fun status(status: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.macie.CfnSession.Builder =
        software.amazon.awscdk.services.macie.CfnSession.Builder.create(scope, id)

    override fun findingPublishingFrequency(findingPublishingFrequency: String) {
      cdkBuilder.findingPublishingFrequency(findingPublishingFrequency)
    }

    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    public fun build(): software.amazon.awscdk.services.macie.CfnSession = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSession {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSession(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.macie.CfnSession): CfnSession =
        CfnSession(cdkObject)

    internal fun unwrap(wrapped: CfnSession): software.amazon.awscdk.services.macie.CfnSession =
        wrapped.cdkObject
  }
}
