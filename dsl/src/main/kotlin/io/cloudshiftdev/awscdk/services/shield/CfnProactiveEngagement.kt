package io.cloudshiftdev.awscdk.services.shield

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnProactiveEngagement internal constructor(
  private val cdkObject: software.amazon.awscdk.services.shield.CfnProactiveEngagement,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrAccountId(): String = unwrap(this).getAttrAccountId()

  public open fun emergencyContactList(): Any = unwrap(this).getEmergencyContactList()

  public open fun emergencyContactList(`value`: IResolvable) {
    unwrap(this).setEmergencyContactList(`value`.let(IResolvable::unwrap))
  }

  public open fun emergencyContactList(__idx_ac66f0: List<Any>) {
    unwrap(this).setEmergencyContactList(__idx_ac66f0)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun proactiveEngagementStatus(): String = unwrap(this).getProactiveEngagementStatus()

  public open fun proactiveEngagementStatus(`value`: String) {
    unwrap(this).setProactiveEngagementStatus(`value`)
  }

  public interface Builder {
    public fun emergencyContactList(emergencyContactList: IResolvable)

    public fun emergencyContactList(emergencyContactList: List<Any>)

    public fun proactiveEngagementStatus(proactiveEngagementStatus: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.shield.CfnProactiveEngagement.Builder =
        software.amazon.awscdk.services.shield.CfnProactiveEngagement.Builder.create(scope, id)

    override fun emergencyContactList(emergencyContactList: IResolvable) {
      cdkBuilder.emergencyContactList(emergencyContactList.let(IResolvable::unwrap))
    }

    override fun emergencyContactList(emergencyContactList: List<Any>) {
      cdkBuilder.emergencyContactList(emergencyContactList)
    }

    override fun proactiveEngagementStatus(proactiveEngagementStatus: String) {
      cdkBuilder.proactiveEngagementStatus(proactiveEngagementStatus)
    }

    public fun build(): software.amazon.awscdk.services.shield.CfnProactiveEngagement =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnProactiveEngagement {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnProactiveEngagement(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.shield.CfnProactiveEngagement):
        CfnProactiveEngagement = CfnProactiveEngagement(cdkObject)

    internal fun unwrap(wrapped: CfnProactiveEngagement):
        software.amazon.awscdk.services.shield.CfnProactiveEngagement = wrapped.cdkObject
  }

  public interface EmergencyContactProperty {
    public fun contactNotes(): String? = unwrap(this).getContactNotes()

    public fun emailAddress(): String

    public fun phoneNumber(): String? = unwrap(this).getPhoneNumber()

    public interface Builder {
      public fun contactNotes(contactNotes: String)

      public fun emailAddress(emailAddress: String)

      public fun phoneNumber(phoneNumber: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.shield.CfnProactiveEngagement.EmergencyContactProperty.Builder
          =
          software.amazon.awscdk.services.shield.CfnProactiveEngagement.EmergencyContactProperty.builder()

      override fun contactNotes(contactNotes: String) {
        cdkBuilder.contactNotes(contactNotes)
      }

      override fun emailAddress(emailAddress: String) {
        cdkBuilder.emailAddress(emailAddress)
      }

      override fun phoneNumber(phoneNumber: String) {
        cdkBuilder.phoneNumber(phoneNumber)
      }

      public fun build():
          software.amazon.awscdk.services.shield.CfnProactiveEngagement.EmergencyContactProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.shield.CfnProactiveEngagement.EmergencyContactProperty,
    ) : EmergencyContactProperty {
      override fun contactNotes(): String? = unwrap(this).getContactNotes()

      override fun emailAddress(): String = unwrap(this).getEmailAddress()

      override fun phoneNumber(): String? = unwrap(this).getPhoneNumber()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EmergencyContactProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.shield.CfnProactiveEngagement.EmergencyContactProperty):
          EmergencyContactProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EmergencyContactProperty):
          software.amazon.awscdk.services.shield.CfnProactiveEngagement.EmergencyContactProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
