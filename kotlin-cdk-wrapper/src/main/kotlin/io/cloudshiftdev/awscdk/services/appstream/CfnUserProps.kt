@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appstream

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnUserProps {
  public fun authenticationType(): String

  public fun firstName(): String? = unwrap(this).getFirstName()

  public fun lastName(): String? = unwrap(this).getLastName()

  public fun messageAction(): String? = unwrap(this).getMessageAction()

  public fun userName(): String

  @CdkDslMarker
  public interface Builder {
    public fun authenticationType(authenticationType: String)

    public fun firstName(firstName: String)

    public fun lastName(lastName: String)

    public fun messageAction(messageAction: String)

    public fun userName(userName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appstream.CfnUserProps.Builder =
        software.amazon.awscdk.services.appstream.CfnUserProps.builder()

    override fun authenticationType(authenticationType: String) {
      cdkBuilder.authenticationType(authenticationType)
    }

    override fun firstName(firstName: String) {
      cdkBuilder.firstName(firstName)
    }

    override fun lastName(lastName: String) {
      cdkBuilder.lastName(lastName)
    }

    override fun messageAction(messageAction: String) {
      cdkBuilder.messageAction(messageAction)
    }

    override fun userName(userName: String) {
      cdkBuilder.userName(userName)
    }

    public fun build(): software.amazon.awscdk.services.appstream.CfnUserProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appstream.CfnUserProps,
  ) : CdkObject(cdkObject), CfnUserProps {
    override fun authenticationType(): String = unwrap(this).getAuthenticationType()

    override fun firstName(): String? = unwrap(this).getFirstName()

    override fun lastName(): String? = unwrap(this).getLastName()

    override fun messageAction(): String? = unwrap(this).getMessageAction()

    override fun userName(): String = unwrap(this).getUserName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUserProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnUserProps):
        CfnUserProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUserProps):
        software.amazon.awscdk.services.appstream.CfnUserProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.appstream.CfnUserProps
  }
}
