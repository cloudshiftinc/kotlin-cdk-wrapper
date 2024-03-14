package io.cloudshiftdev.awscdk.services.identitystore

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnGroupMembership internal constructor(
  private val cdkObject: software.amazon.awscdk.services.identitystore.CfnGroupMembership,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrMembershipId(): String = unwrap(this).getAttrMembershipId()

  public open fun groupId(): String = unwrap(this).getGroupId()

  public open fun groupId(`value`: String) {
    unwrap(this).setGroupId(`value`)
  }

  public open fun identityStoreId(): String = unwrap(this).getIdentityStoreId()

  public open fun identityStoreId(`value`: String) {
    unwrap(this).setIdentityStoreId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun memberId(): Any = unwrap(this).getMemberId()

  public open fun memberId(`value`: IResolvable) {
    unwrap(this).setMemberId(`value`.let(IResolvable::unwrap))
  }

  public open fun memberId(`value`: MemberIdProperty) {
    unwrap(this).setMemberId(`value`.let(MemberIdProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9295de6d7392ce0c25ee4e715578e5d6cad70f2217ae5f003959a0b5879c05bf")
  public open fun memberId(`value`: MemberIdProperty.Builder.() -> Unit): Unit =
      memberId(MemberIdProperty(`value`))

  public interface Builder {
    public fun groupId(groupId: String)

    public fun identityStoreId(identityStoreId: String)

    public fun memberId(memberId: IResolvable)

    public fun memberId(memberId: MemberIdProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a29122fdd8b767b4763624504215576f8c19359375d7c72b5b0b8a8eab753572")
    public fun memberId(memberId: MemberIdProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.identitystore.CfnGroupMembership.Builder
        = software.amazon.awscdk.services.identitystore.CfnGroupMembership.Builder.create(scope, id)

    override fun groupId(groupId: String) {
      cdkBuilder.groupId(groupId)
    }

    override fun identityStoreId(identityStoreId: String) {
      cdkBuilder.identityStoreId(identityStoreId)
    }

    override fun memberId(memberId: IResolvable) {
      cdkBuilder.memberId(memberId.let(IResolvable::unwrap))
    }

    override fun memberId(memberId: MemberIdProperty) {
      cdkBuilder.memberId(memberId.let(MemberIdProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a29122fdd8b767b4763624504215576f8c19359375d7c72b5b0b8a8eab753572")
    override fun memberId(memberId: MemberIdProperty.Builder.() -> Unit): Unit =
        memberId(MemberIdProperty(memberId))

    public fun build(): software.amazon.awscdk.services.identitystore.CfnGroupMembership =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGroupMembership {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGroupMembership(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.identitystore.CfnGroupMembership):
        CfnGroupMembership = CfnGroupMembership(cdkObject)

    internal fun unwrap(wrapped: CfnGroupMembership):
        software.amazon.awscdk.services.identitystore.CfnGroupMembership = wrapped.cdkObject
  }

  public interface MemberIdProperty {
    public fun userId(): String

    public interface Builder {
      public fun userId(userId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.identitystore.CfnGroupMembership.MemberIdProperty.Builder
          =
          software.amazon.awscdk.services.identitystore.CfnGroupMembership.MemberIdProperty.builder()

      override fun userId(userId: String) {
        cdkBuilder.userId(userId)
      }

      public fun build():
          software.amazon.awscdk.services.identitystore.CfnGroupMembership.MemberIdProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.identitystore.CfnGroupMembership.MemberIdProperty,
    ) : MemberIdProperty {
      override fun userId(): String = unwrap(this).getUserId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MemberIdProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.identitystore.CfnGroupMembership.MemberIdProperty):
          MemberIdProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MemberIdProperty):
          software.amazon.awscdk.services.identitystore.CfnGroupMembership.MemberIdProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
