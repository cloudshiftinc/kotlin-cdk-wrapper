package io.cloudshiftdev.awscdk.services.cloudformation

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPublisher internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudformation.CfnPublisher,
) : CfnResource(cdkObject), IInspectable {
  public open fun acceptTermsAndConditions(): Any = unwrap(this).getAcceptTermsAndConditions()

  public open fun acceptTermsAndConditions(`value`: Boolean) {
    unwrap(this).setAcceptTermsAndConditions(`value`)
  }

  public open fun acceptTermsAndConditions(`value`: IResolvable) {
    unwrap(this).setAcceptTermsAndConditions(`value`.let(IResolvable::unwrap))
  }

  public open fun attrIdentityProvider(): String = unwrap(this).getAttrIdentityProvider()

  public open fun attrPublisherId(): String = unwrap(this).getAttrPublisherId()

  public open fun attrPublisherProfile(): String = unwrap(this).getAttrPublisherProfile()

  public open fun attrPublisherStatus(): String = unwrap(this).getAttrPublisherStatus()

  public open fun connectionArn(): String? = unwrap(this).getConnectionArn()

  public open fun connectionArn(`value`: String) {
    unwrap(this).setConnectionArn(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public interface Builder {
    public fun acceptTermsAndConditions(acceptTermsAndConditions: Boolean)

    public fun acceptTermsAndConditions(acceptTermsAndConditions: IResolvable)

    public fun connectionArn(connectionArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudformation.CfnPublisher.Builder =
        software.amazon.awscdk.services.cloudformation.CfnPublisher.Builder.create(scope, id)

    override fun acceptTermsAndConditions(acceptTermsAndConditions: Boolean) {
      cdkBuilder.acceptTermsAndConditions(acceptTermsAndConditions)
    }

    override fun acceptTermsAndConditions(acceptTermsAndConditions: IResolvable) {
      cdkBuilder.acceptTermsAndConditions(acceptTermsAndConditions.let(IResolvable::unwrap))
    }

    override fun connectionArn(connectionArn: String) {
      cdkBuilder.connectionArn(connectionArn)
    }

    public fun build(): software.amazon.awscdk.services.cloudformation.CfnPublisher =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPublisher {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPublisher(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudformation.CfnPublisher):
        CfnPublisher = CfnPublisher(cdkObject)

    internal fun unwrap(wrapped: CfnPublisher):
        software.amazon.awscdk.services.cloudformation.CfnPublisher = wrapped.cdkObject
  }
}
