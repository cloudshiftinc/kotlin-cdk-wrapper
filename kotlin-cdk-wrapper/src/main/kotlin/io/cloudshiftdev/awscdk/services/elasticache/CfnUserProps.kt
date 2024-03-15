@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticache

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnUserProps {
  public fun accessString(): String? = unwrap(this).getAccessString()

  public fun authenticationMode(): Any? = unwrap(this).getAuthenticationMode()

  public fun engine(): String

  public fun noPasswordRequired(): Any? = unwrap(this).getNoPasswordRequired()

  public fun passwords(): List<String> = unwrap(this).getPasswords() ?: emptyList()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun userId(): String

  public fun userName(): String

  @CdkDslMarker
  public interface Builder {
    public fun accessString(accessString: String)

    public fun authenticationMode(authenticationMode: Any)

    public fun engine(engine: String)

    public fun noPasswordRequired(noPasswordRequired: Boolean)

    public fun noPasswordRequired(noPasswordRequired: IResolvable)

    public fun passwords(passwords: List<String>)

    public fun passwords(vararg passwords: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun userId(userId: String)

    public fun userName(userName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.elasticache.CfnUserProps.Builder =
        software.amazon.awscdk.services.elasticache.CfnUserProps.builder()

    override fun accessString(accessString: String) {
      cdkBuilder.accessString(accessString)
    }

    override fun authenticationMode(authenticationMode: Any) {
      cdkBuilder.authenticationMode(authenticationMode)
    }

    override fun engine(engine: String) {
      cdkBuilder.engine(engine)
    }

    override fun noPasswordRequired(noPasswordRequired: Boolean) {
      cdkBuilder.noPasswordRequired(noPasswordRequired)
    }

    override fun noPasswordRequired(noPasswordRequired: IResolvable) {
      cdkBuilder.noPasswordRequired(noPasswordRequired.let(IResolvable::unwrap))
    }

    override fun passwords(passwords: List<String>) {
      cdkBuilder.passwords(passwords)
    }

    override fun passwords(vararg passwords: String): Unit = passwords(passwords.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun userId(userId: String) {
      cdkBuilder.userId(userId)
    }

    override fun userName(userName: String) {
      cdkBuilder.userName(userName)
    }

    public fun build(): software.amazon.awscdk.services.elasticache.CfnUserProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.elasticache.CfnUserProps,
  ) : CdkObject(cdkObject), CfnUserProps {
    override fun accessString(): String? = unwrap(this).getAccessString()

    override fun authenticationMode(): Any? = unwrap(this).getAuthenticationMode()

    override fun engine(): String = unwrap(this).getEngine()

    override fun noPasswordRequired(): Any? = unwrap(this).getNoPasswordRequired()

    override fun passwords(): List<String> = unwrap(this).getPasswords() ?: emptyList()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun userId(): String = unwrap(this).getUserId()

    override fun userName(): String = unwrap(this).getUserName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUserProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnUserProps):
        CfnUserProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUserProps):
        software.amazon.awscdk.services.elasticache.CfnUserProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.elasticache.CfnUserProps
  }
}
