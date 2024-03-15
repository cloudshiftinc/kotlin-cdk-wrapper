@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appstream

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnStackUserAssociation internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.appstream.CfnStackUserAssociation,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun authenticationType(): String = unwrap(this).getAuthenticationType()

  public open fun authenticationType(`value`: String) {
    unwrap(this).setAuthenticationType(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun sendEmailNotification(): Any? = unwrap(this).getSendEmailNotification()

  public open fun sendEmailNotification(`value`: Boolean) {
    unwrap(this).setSendEmailNotification(`value`)
  }

  public open fun sendEmailNotification(`value`: IResolvable) {
    unwrap(this).setSendEmailNotification(`value`.let(IResolvable::unwrap))
  }

  public open fun stackName(): String = unwrap(this).getStackName()

  public open fun stackName(`value`: String) {
    unwrap(this).setStackName(`value`)
  }

  public open fun userName(): String = unwrap(this).getUserName()

  public open fun userName(`value`: String) {
    unwrap(this).setUserName(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun authenticationType(authenticationType: String)

    public fun sendEmailNotification(sendEmailNotification: Boolean)

    public fun sendEmailNotification(sendEmailNotification: IResolvable)

    public fun stackName(stackName: String)

    public fun userName(userName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appstream.CfnStackUserAssociation.Builder =
        software.amazon.awscdk.services.appstream.CfnStackUserAssociation.Builder.create(scope, id)

    override fun authenticationType(authenticationType: String) {
      cdkBuilder.authenticationType(authenticationType)
    }

    override fun sendEmailNotification(sendEmailNotification: Boolean) {
      cdkBuilder.sendEmailNotification(sendEmailNotification)
    }

    override fun sendEmailNotification(sendEmailNotification: IResolvable) {
      cdkBuilder.sendEmailNotification(sendEmailNotification.let(IResolvable::unwrap))
    }

    override fun stackName(stackName: String) {
      cdkBuilder.stackName(stackName)
    }

    override fun userName(userName: String) {
      cdkBuilder.userName(userName)
    }

    public fun build(): software.amazon.awscdk.services.appstream.CfnStackUserAssociation =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.appstream.CfnStackUserAssociation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStackUserAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStackUserAssociation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnStackUserAssociation):
        CfnStackUserAssociation = CfnStackUserAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnStackUserAssociation):
        software.amazon.awscdk.services.appstream.CfnStackUserAssociation = wrapped.cdkObject
  }
}
