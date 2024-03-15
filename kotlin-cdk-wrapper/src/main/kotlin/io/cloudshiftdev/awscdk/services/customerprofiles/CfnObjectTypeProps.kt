@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.customerprofiles

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnObjectTypeProps {
  public fun allowProfileCreation(): Any? = unwrap(this).getAllowProfileCreation()

  public fun description(): String

  public fun domainName(): String

  public fun encryptionKey(): String? = unwrap(this).getEncryptionKey()

  public fun expirationDays(): Number? = unwrap(this).getExpirationDays()

  public fun fields(): Any? = unwrap(this).getFields()

  public fun keys(): Any? = unwrap(this).getKeys()

  public fun objectTypeName(): String

  public fun sourceLastUpdatedTimestampFormat(): String? =
      unwrap(this).getSourceLastUpdatedTimestampFormat()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun templateId(): String? = unwrap(this).getTemplateId()

  @CdkDslMarker
  public interface Builder {
    public fun allowProfileCreation(allowProfileCreation: Boolean)

    public fun allowProfileCreation(allowProfileCreation: IResolvable)

    public fun description(description: String)

    public fun domainName(domainName: String)

    public fun encryptionKey(encryptionKey: String)

    public fun expirationDays(expirationDays: Number)

    public fun fields(fields: IResolvable)

    public fun fields(fields: List<Any>)

    public fun fields(vararg fields: Any)

    public fun keys(keys: IResolvable)

    public fun keys(keys: List<Any>)

    public fun keys(vararg keys: Any)

    public fun objectTypeName(objectTypeName: String)

    public fun sourceLastUpdatedTimestampFormat(sourceLastUpdatedTimestampFormat: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun templateId(templateId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.customerprofiles.CfnObjectTypeProps.Builder =
        software.amazon.awscdk.services.customerprofiles.CfnObjectTypeProps.builder()

    override fun allowProfileCreation(allowProfileCreation: Boolean) {
      cdkBuilder.allowProfileCreation(allowProfileCreation)
    }

    override fun allowProfileCreation(allowProfileCreation: IResolvable) {
      cdkBuilder.allowProfileCreation(allowProfileCreation.let(IResolvable::unwrap))
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    override fun encryptionKey(encryptionKey: String) {
      cdkBuilder.encryptionKey(encryptionKey)
    }

    override fun expirationDays(expirationDays: Number) {
      cdkBuilder.expirationDays(expirationDays)
    }

    override fun fields(fields: IResolvable) {
      cdkBuilder.fields(fields.let(IResolvable::unwrap))
    }

    override fun fields(fields: List<Any>) {
      cdkBuilder.fields(fields)
    }

    override fun fields(vararg fields: Any): Unit = fields(fields.toList())

    override fun keys(keys: IResolvable) {
      cdkBuilder.keys(keys.let(IResolvable::unwrap))
    }

    override fun keys(keys: List<Any>) {
      cdkBuilder.keys(keys)
    }

    override fun keys(vararg keys: Any): Unit = keys(keys.toList())

    override fun objectTypeName(objectTypeName: String) {
      cdkBuilder.objectTypeName(objectTypeName)
    }

    override fun sourceLastUpdatedTimestampFormat(sourceLastUpdatedTimestampFormat: String) {
      cdkBuilder.sourceLastUpdatedTimestampFormat(sourceLastUpdatedTimestampFormat)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun templateId(templateId: String) {
      cdkBuilder.templateId(templateId)
    }

    public fun build(): software.amazon.awscdk.services.customerprofiles.CfnObjectTypeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.customerprofiles.CfnObjectTypeProps,
  ) : CdkObject(cdkObject), CfnObjectTypeProps {
    override fun allowProfileCreation(): Any? = unwrap(this).getAllowProfileCreation()

    override fun description(): String = unwrap(this).getDescription()

    override fun domainName(): String = unwrap(this).getDomainName()

    override fun encryptionKey(): String? = unwrap(this).getEncryptionKey()

    override fun expirationDays(): Number? = unwrap(this).getExpirationDays()

    override fun fields(): Any? = unwrap(this).getFields()

    override fun keys(): Any? = unwrap(this).getKeys()

    override fun objectTypeName(): String = unwrap(this).getObjectTypeName()

    override fun sourceLastUpdatedTimestampFormat(): String? =
        unwrap(this).getSourceLastUpdatedTimestampFormat()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun templateId(): String? = unwrap(this).getTemplateId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnObjectTypeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnObjectTypeProps):
        CfnObjectTypeProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnObjectTypeProps):
        software.amazon.awscdk.services.customerprofiles.CfnObjectTypeProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.customerprofiles.CfnObjectTypeProps
  }
}
