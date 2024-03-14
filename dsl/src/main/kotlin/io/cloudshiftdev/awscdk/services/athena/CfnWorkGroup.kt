package io.cloudshiftdev.awscdk.services.athena

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnWorkGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.athena.CfnWorkGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  public open fun attrWorkGroupConfigurationEngineVersionEffectiveEngineVersion(): String =
      unwrap(this).getAttrWorkGroupConfigurationEngineVersionEffectiveEngineVersion()

  public open fun attrWorkGroupConfigurationUpdatesEngineVersionEffectiveEngineVersion(): String =
      unwrap(this).getAttrWorkGroupConfigurationUpdatesEngineVersionEffectiveEngineVersion()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun recursiveDeleteOption(): Any? = unwrap(this).getRecursiveDeleteOption()

  public open fun recursiveDeleteOption(`value`: Boolean) {
    unwrap(this).setRecursiveDeleteOption(`value`)
  }

  public open fun recursiveDeleteOption(`value`: IResolvable) {
    unwrap(this).setRecursiveDeleteOption(`value`.let(IResolvable::unwrap))
  }

  public open fun state(): String? = unwrap(this).getState()

  public open fun state(`value`: String) {
    unwrap(this).setState(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun workGroupConfiguration(): Any? = unwrap(this).getWorkGroupConfiguration()

  public open fun workGroupConfiguration(`value`: IResolvable) {
    unwrap(this).setWorkGroupConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun workGroupConfiguration(`value`: WorkGroupConfigurationProperty) {
    unwrap(this).setWorkGroupConfiguration(`value`.let(WorkGroupConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("08197e3fea4e971d51770d7d6af42009dd155bda64d71821f596e2f93d8aa30c")
  public open
      fun workGroupConfiguration(`value`: WorkGroupConfigurationProperty.Builder.() -> Unit): Unit =
      workGroupConfiguration(WorkGroupConfigurationProperty(`value`))

  @Deprecated(message = "deprecated in CDK")
  public open fun workGroupConfigurationUpdates(): Any? =
      unwrap(this).getWorkGroupConfigurationUpdates()

  @Deprecated(message = "deprecated in CDK")
  public open fun workGroupConfigurationUpdates(`value`: IResolvable) {
    unwrap(this).setWorkGroupConfigurationUpdates(`value`.let(IResolvable::unwrap))
  }

  @Deprecated(message = "deprecated in CDK")
  public open fun workGroupConfigurationUpdates(`value`: WorkGroupConfigurationUpdatesProperty) {
    unwrap(this).setWorkGroupConfigurationUpdates(`value`.let(WorkGroupConfigurationUpdatesProperty::unwrap))
  }

  @Deprecated(message = "deprecated in CDK")
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("81379921322b3083fce70b877509398af0dda282e1c4b62f97bad46eefba2cff")
  public open
      fun workGroupConfigurationUpdates(`value`: WorkGroupConfigurationUpdatesProperty.Builder.() -> Unit):
      Unit = workGroupConfigurationUpdates(WorkGroupConfigurationUpdatesProperty(`value`))

  public interface Builder {
    public fun description(description: String) {
    }

    public fun name(name: String) {
    }

    public fun recursiveDeleteOption(recursiveDeleteOption: Boolean) {
    }

    public fun recursiveDeleteOption(recursiveDeleteOption: IResolvable) {
    }

    public fun state(state: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun workGroupConfiguration(workGroupConfiguration: IResolvable) {
    }

    public fun workGroupConfiguration(workGroupConfiguration: WorkGroupConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bdbf5df75bff28bcf2c4c135c41719aff877729fee462a9515aa8f25de7d5083")
    public
        fun workGroupConfiguration(workGroupConfiguration: WorkGroupConfigurationProperty.Builder.() -> Unit) {
    }

    @Deprecated(message = "deprecated in CDK")
    public fun workGroupConfigurationUpdates(workGroupConfigurationUpdates: IResolvable) {
    }

    @Deprecated(message = "deprecated in CDK")
    public
        fun workGroupConfigurationUpdates(workGroupConfigurationUpdates: WorkGroupConfigurationUpdatesProperty) {
    }

    @Deprecated(message = "deprecated in CDK")
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("95c10e9a5235a94633db4c700f62ba4abe1b553349608ed18808f312a27a927f")
    public
        fun workGroupConfigurationUpdates(workGroupConfigurationUpdates: WorkGroupConfigurationUpdatesProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.athena.CfnWorkGroup.Builder =
        software.amazon.awscdk.services.athena.CfnWorkGroup.Builder.create(scope, id)

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun recursiveDeleteOption(recursiveDeleteOption: Boolean) {
      cdkBuilder.recursiveDeleteOption(recursiveDeleteOption)
    }

    public override fun recursiveDeleteOption(recursiveDeleteOption: IResolvable) {
      cdkBuilder.recursiveDeleteOption(recursiveDeleteOption.let(IResolvable::unwrap))
    }

    public override fun state(state: String) {
      cdkBuilder.state(state)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun workGroupConfiguration(workGroupConfiguration: IResolvable) {
      cdkBuilder.workGroupConfiguration(workGroupConfiguration.let(IResolvable::unwrap))
    }

    public override
        fun workGroupConfiguration(workGroupConfiguration: WorkGroupConfigurationProperty) {
      cdkBuilder.workGroupConfiguration(workGroupConfiguration.let(WorkGroupConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bdbf5df75bff28bcf2c4c135c41719aff877729fee462a9515aa8f25de7d5083")
    public override
        fun workGroupConfiguration(workGroupConfiguration: WorkGroupConfigurationProperty.Builder.() -> Unit):
        Unit = workGroupConfiguration(WorkGroupConfigurationProperty(workGroupConfiguration))

    @Deprecated(message = "deprecated in CDK")
    public override fun workGroupConfigurationUpdates(workGroupConfigurationUpdates: IResolvable) {
      cdkBuilder.workGroupConfigurationUpdates(workGroupConfigurationUpdates.let(IResolvable::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    public override
        fun workGroupConfigurationUpdates(workGroupConfigurationUpdates: WorkGroupConfigurationUpdatesProperty) {
      cdkBuilder.workGroupConfigurationUpdates(workGroupConfigurationUpdates.let(WorkGroupConfigurationUpdatesProperty::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("95c10e9a5235a94633db4c700f62ba4abe1b553349608ed18808f312a27a927f")
    public override
        fun workGroupConfigurationUpdates(workGroupConfigurationUpdates: WorkGroupConfigurationUpdatesProperty.Builder.() -> Unit):
        Unit =
        workGroupConfigurationUpdates(WorkGroupConfigurationUpdatesProperty(workGroupConfigurationUpdates))

    public fun build(): software.amazon.awscdk.services.athena.CfnWorkGroup = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWorkGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWorkGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.athena.CfnWorkGroup): CfnWorkGroup
        = CfnWorkGroup(cdkObject)

    internal fun unwrap(wrapped: CfnWorkGroup): software.amazon.awscdk.services.athena.CfnWorkGroup
        = wrapped.cdkObject
  }

  public interface EngineVersionProperty {
    public fun effectiveEngineVersion(): String? = unwrap(this).getEffectiveEngineVersion()

    public fun selectedEngineVersion(): String? = unwrap(this).getSelectedEngineVersion()

    public interface Builder {
      public fun effectiveEngineVersion(effectiveEngineVersion: String) {
      }

      public fun selectedEngineVersion(selectedEngineVersion: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.athena.CfnWorkGroup.EngineVersionProperty.Builder =
          software.amazon.awscdk.services.athena.CfnWorkGroup.EngineVersionProperty.builder()

      public override fun effectiveEngineVersion(effectiveEngineVersion: String) {
        cdkBuilder.effectiveEngineVersion(effectiveEngineVersion)
      }

      public override fun selectedEngineVersion(selectedEngineVersion: String) {
        cdkBuilder.selectedEngineVersion(selectedEngineVersion)
      }

      public fun build(): software.amazon.awscdk.services.athena.CfnWorkGroup.EngineVersionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.athena.CfnWorkGroup.EngineVersionProperty,
    ) : EngineVersionProperty {
      public override fun effectiveEngineVersion(): String? =
          unwrap(this).getEffectiveEngineVersion()

      public override fun selectedEngineVersion(): String? = unwrap(this).getSelectedEngineVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EngineVersionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.athena.CfnWorkGroup.EngineVersionProperty):
          EngineVersionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EngineVersionProperty):
          software.amazon.awscdk.services.athena.CfnWorkGroup.EngineVersionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ResultConfigurationUpdatesProperty {
    public fun aclConfiguration(): Any? = unwrap(this).getAclConfiguration()

    public fun encryptionConfiguration(): Any? = unwrap(this).getEncryptionConfiguration()

    public fun expectedBucketOwner(): String? = unwrap(this).getExpectedBucketOwner()

    public fun outputLocation(): String? = unwrap(this).getOutputLocation()

    public fun removeAclConfiguration(): Any? = unwrap(this).getRemoveAclConfiguration()

    public fun removeEncryptionConfiguration(): Any? =
        unwrap(this).getRemoveEncryptionConfiguration()

    public fun removeExpectedBucketOwner(): Any? = unwrap(this).getRemoveExpectedBucketOwner()

    public fun removeOutputLocation(): Any? = unwrap(this).getRemoveOutputLocation()

    public interface Builder {
      public fun aclConfiguration(aclConfiguration: IResolvable) {
      }

      public fun aclConfiguration(aclConfiguration: AclConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ca1ee933f5c4842cb22a913294746eb4af230a932debbb6cce453856b9fde274")
      public fun aclConfiguration(aclConfiguration: AclConfigurationProperty.Builder.() -> Unit) {
      }

      public fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
      }

      public fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("98e3b68155ccd82ee4bdbc2fae17690ccf3fddf288f298ec025740fd92dbe9c6")
      public
          fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty.Builder.() -> Unit) {
      }

      public fun expectedBucketOwner(expectedBucketOwner: String) {
      }

      public fun outputLocation(outputLocation: String) {
      }

      public fun removeAclConfiguration(removeAclConfiguration: Boolean) {
      }

      public fun removeAclConfiguration(removeAclConfiguration: IResolvable) {
      }

      public fun removeEncryptionConfiguration(removeEncryptionConfiguration: Boolean) {
      }

      public fun removeEncryptionConfiguration(removeEncryptionConfiguration: IResolvable) {
      }

      public fun removeExpectedBucketOwner(removeExpectedBucketOwner: Boolean) {
      }

      public fun removeExpectedBucketOwner(removeExpectedBucketOwner: IResolvable) {
      }

      public fun removeOutputLocation(removeOutputLocation: Boolean) {
      }

      public fun removeOutputLocation(removeOutputLocation: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.athena.CfnWorkGroup.ResultConfigurationUpdatesProperty.Builder
          =
          software.amazon.awscdk.services.athena.CfnWorkGroup.ResultConfigurationUpdatesProperty.builder()

      public override fun aclConfiguration(aclConfiguration: IResolvable) {
        cdkBuilder.aclConfiguration(aclConfiguration.let(IResolvable::unwrap))
      }

      public override fun aclConfiguration(aclConfiguration: AclConfigurationProperty) {
        cdkBuilder.aclConfiguration(aclConfiguration.let(AclConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ca1ee933f5c4842cb22a913294746eb4af230a932debbb6cce453856b9fde274")
      public override
          fun aclConfiguration(aclConfiguration: AclConfigurationProperty.Builder.() -> Unit): Unit
          = aclConfiguration(AclConfigurationProperty(aclConfiguration))

      public override fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(EncryptionConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("98e3b68155ccd82ee4bdbc2fae17690ccf3fddf288f298ec025740fd92dbe9c6")
      public override
          fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty.Builder.() -> Unit):
          Unit = encryptionConfiguration(EncryptionConfigurationProperty(encryptionConfiguration))

      public override fun expectedBucketOwner(expectedBucketOwner: String) {
        cdkBuilder.expectedBucketOwner(expectedBucketOwner)
      }

      public override fun outputLocation(outputLocation: String) {
        cdkBuilder.outputLocation(outputLocation)
      }

      public override fun removeAclConfiguration(removeAclConfiguration: Boolean) {
        cdkBuilder.removeAclConfiguration(removeAclConfiguration)
      }

      public override fun removeAclConfiguration(removeAclConfiguration: IResolvable) {
        cdkBuilder.removeAclConfiguration(removeAclConfiguration.let(IResolvable::unwrap))
      }

      public override fun removeEncryptionConfiguration(removeEncryptionConfiguration: Boolean) {
        cdkBuilder.removeEncryptionConfiguration(removeEncryptionConfiguration)
      }

      public override
          fun removeEncryptionConfiguration(removeEncryptionConfiguration: IResolvable) {
        cdkBuilder.removeEncryptionConfiguration(removeEncryptionConfiguration.let(IResolvable::unwrap))
      }

      public override fun removeExpectedBucketOwner(removeExpectedBucketOwner: Boolean) {
        cdkBuilder.removeExpectedBucketOwner(removeExpectedBucketOwner)
      }

      public override fun removeExpectedBucketOwner(removeExpectedBucketOwner: IResolvable) {
        cdkBuilder.removeExpectedBucketOwner(removeExpectedBucketOwner.let(IResolvable::unwrap))
      }

      public override fun removeOutputLocation(removeOutputLocation: Boolean) {
        cdkBuilder.removeOutputLocation(removeOutputLocation)
      }

      public override fun removeOutputLocation(removeOutputLocation: IResolvable) {
        cdkBuilder.removeOutputLocation(removeOutputLocation.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.athena.CfnWorkGroup.ResultConfigurationUpdatesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.athena.CfnWorkGroup.ResultConfigurationUpdatesProperty,
    ) : ResultConfigurationUpdatesProperty {
      public override fun aclConfiguration(): Any? = unwrap(this).getAclConfiguration()

      public override fun encryptionConfiguration(): Any? =
          unwrap(this).getEncryptionConfiguration()

      public override fun expectedBucketOwner(): String? = unwrap(this).getExpectedBucketOwner()

      public override fun outputLocation(): String? = unwrap(this).getOutputLocation()

      public override fun removeAclConfiguration(): Any? = unwrap(this).getRemoveAclConfiguration()

      public override fun removeEncryptionConfiguration(): Any? =
          unwrap(this).getRemoveEncryptionConfiguration()

      public override fun removeExpectedBucketOwner(): Any? =
          unwrap(this).getRemoveExpectedBucketOwner()

      public override fun removeOutputLocation(): Any? = unwrap(this).getRemoveOutputLocation()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ResultConfigurationUpdatesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.athena.CfnWorkGroup.ResultConfigurationUpdatesProperty):
          ResultConfigurationUpdatesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResultConfigurationUpdatesProperty):
          software.amazon.awscdk.services.athena.CfnWorkGroup.ResultConfigurationUpdatesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ResultConfigurationProperty {
    public fun aclConfiguration(): Any? = unwrap(this).getAclConfiguration()

    public fun encryptionConfiguration(): Any? = unwrap(this).getEncryptionConfiguration()

    public fun expectedBucketOwner(): String? = unwrap(this).getExpectedBucketOwner()

    public fun outputLocation(): String? = unwrap(this).getOutputLocation()

    public interface Builder {
      public fun aclConfiguration(aclConfiguration: IResolvable) {
      }

      public fun aclConfiguration(aclConfiguration: AclConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("411aa155ffc38a1c109962c4dcdad1093e7373d6f7aa57cbcd23a0698ce99120")
      public fun aclConfiguration(aclConfiguration: AclConfigurationProperty.Builder.() -> Unit) {
      }

      public fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
      }

      public fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5203c5f393dec1aa3e91088a082705ed6f73eac66b6b62ee8a887ec08dd6f120")
      public
          fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty.Builder.() -> Unit) {
      }

      public fun expectedBucketOwner(expectedBucketOwner: String) {
      }

      public fun outputLocation(outputLocation: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.athena.CfnWorkGroup.ResultConfigurationProperty.Builder =
          software.amazon.awscdk.services.athena.CfnWorkGroup.ResultConfigurationProperty.builder()

      public override fun aclConfiguration(aclConfiguration: IResolvable) {
        cdkBuilder.aclConfiguration(aclConfiguration.let(IResolvable::unwrap))
      }

      public override fun aclConfiguration(aclConfiguration: AclConfigurationProperty) {
        cdkBuilder.aclConfiguration(aclConfiguration.let(AclConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("411aa155ffc38a1c109962c4dcdad1093e7373d6f7aa57cbcd23a0698ce99120")
      public override
          fun aclConfiguration(aclConfiguration: AclConfigurationProperty.Builder.() -> Unit): Unit
          = aclConfiguration(AclConfigurationProperty(aclConfiguration))

      public override fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(EncryptionConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5203c5f393dec1aa3e91088a082705ed6f73eac66b6b62ee8a887ec08dd6f120")
      public override
          fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty.Builder.() -> Unit):
          Unit = encryptionConfiguration(EncryptionConfigurationProperty(encryptionConfiguration))

      public override fun expectedBucketOwner(expectedBucketOwner: String) {
        cdkBuilder.expectedBucketOwner(expectedBucketOwner)
      }

      public override fun outputLocation(outputLocation: String) {
        cdkBuilder.outputLocation(outputLocation)
      }

      public fun build():
          software.amazon.awscdk.services.athena.CfnWorkGroup.ResultConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.athena.CfnWorkGroup.ResultConfigurationProperty,
    ) : ResultConfigurationProperty {
      public override fun aclConfiguration(): Any? = unwrap(this).getAclConfiguration()

      public override fun encryptionConfiguration(): Any? =
          unwrap(this).getEncryptionConfiguration()

      public override fun expectedBucketOwner(): String? = unwrap(this).getExpectedBucketOwner()

      public override fun outputLocation(): String? = unwrap(this).getOutputLocation()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ResultConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.athena.CfnWorkGroup.ResultConfigurationProperty):
          ResultConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResultConfigurationProperty):
          software.amazon.awscdk.services.athena.CfnWorkGroup.ResultConfigurationProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface WorkGroupConfigurationUpdatesProperty {
    public fun additionalConfiguration(): String? = unwrap(this).getAdditionalConfiguration()

    public fun bytesScannedCutoffPerQuery(): Number? = unwrap(this).getBytesScannedCutoffPerQuery()

    public fun customerContentEncryptionConfiguration(): Any? =
        unwrap(this).getCustomerContentEncryptionConfiguration()

    public fun enforceWorkGroupConfiguration(): Any? =
        unwrap(this).getEnforceWorkGroupConfiguration()

    public fun engineVersion(): Any? = unwrap(this).getEngineVersion()

    public fun executionRole(): String? = unwrap(this).getExecutionRole()

    public fun publishCloudWatchMetricsEnabled(): Any? =
        unwrap(this).getPublishCloudWatchMetricsEnabled()

    public fun removeBytesScannedCutoffPerQuery(): Any? =
        unwrap(this).getRemoveBytesScannedCutoffPerQuery()

    public fun removeCustomerContentEncryptionConfiguration(): Any? =
        unwrap(this).getRemoveCustomerContentEncryptionConfiguration()

    public fun requesterPaysEnabled(): Any? = unwrap(this).getRequesterPaysEnabled()

    public fun resultConfigurationUpdates(): Any? = unwrap(this).getResultConfigurationUpdates()

    public interface Builder {
      public fun additionalConfiguration(additionalConfiguration: String) {
      }

      public fun bytesScannedCutoffPerQuery(bytesScannedCutoffPerQuery: Number) {
      }

      public
          fun customerContentEncryptionConfiguration(customerContentEncryptionConfiguration: IResolvable) {
      }

      public
          fun customerContentEncryptionConfiguration(customerContentEncryptionConfiguration: CustomerContentEncryptionConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("776733b5dc97dd9df75355f3312a80aa992a5329bee56f4284ed4dbe88d5f39b")
      public
          fun customerContentEncryptionConfiguration(customerContentEncryptionConfiguration: CustomerContentEncryptionConfigurationProperty.Builder.() -> Unit) {
      }

      public fun enforceWorkGroupConfiguration(enforceWorkGroupConfiguration: Boolean) {
      }

      public fun enforceWorkGroupConfiguration(enforceWorkGroupConfiguration: IResolvable) {
      }

      public fun engineVersion(engineVersion: IResolvable) {
      }

      public fun engineVersion(engineVersion: EngineVersionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0b286f7f543152c6f37cc53f1379386fbf11a01c719cab1ead34d128875b08eb")
      public fun engineVersion(engineVersion: EngineVersionProperty.Builder.() -> Unit) {
      }

      public fun executionRole(executionRole: String) {
      }

      public fun publishCloudWatchMetricsEnabled(publishCloudWatchMetricsEnabled: Boolean) {
      }

      public fun publishCloudWatchMetricsEnabled(publishCloudWatchMetricsEnabled: IResolvable) {
      }

      public fun removeBytesScannedCutoffPerQuery(removeBytesScannedCutoffPerQuery: Boolean) {
      }

      public fun removeBytesScannedCutoffPerQuery(removeBytesScannedCutoffPerQuery: IResolvable) {
      }

      public
          fun removeCustomerContentEncryptionConfiguration(removeCustomerContentEncryptionConfiguration: Boolean) {
      }

      public
          fun removeCustomerContentEncryptionConfiguration(removeCustomerContentEncryptionConfiguration: IResolvable) {
      }

      public fun requesterPaysEnabled(requesterPaysEnabled: Boolean) {
      }

      public fun requesterPaysEnabled(requesterPaysEnabled: IResolvable) {
      }

      public fun resultConfigurationUpdates(resultConfigurationUpdates: IResolvable) {
      }

      public
          fun resultConfigurationUpdates(resultConfigurationUpdates: ResultConfigurationUpdatesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac011ddfd0736211190b806a9feab225d5f224d06c649c15660ec65cbe3cd716")
      public
          fun resultConfigurationUpdates(resultConfigurationUpdates: ResultConfigurationUpdatesProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.athena.CfnWorkGroup.WorkGroupConfigurationUpdatesProperty.Builder
          =
          software.amazon.awscdk.services.athena.CfnWorkGroup.WorkGroupConfigurationUpdatesProperty.builder()

      public override fun additionalConfiguration(additionalConfiguration: String) {
        cdkBuilder.additionalConfiguration(additionalConfiguration)
      }

      public override fun bytesScannedCutoffPerQuery(bytesScannedCutoffPerQuery: Number) {
        cdkBuilder.bytesScannedCutoffPerQuery(bytesScannedCutoffPerQuery)
      }

      public override
          fun customerContentEncryptionConfiguration(customerContentEncryptionConfiguration: IResolvable) {
        cdkBuilder.customerContentEncryptionConfiguration(customerContentEncryptionConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun customerContentEncryptionConfiguration(customerContentEncryptionConfiguration: CustomerContentEncryptionConfigurationProperty) {
        cdkBuilder.customerContentEncryptionConfiguration(customerContentEncryptionConfiguration.let(CustomerContentEncryptionConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("776733b5dc97dd9df75355f3312a80aa992a5329bee56f4284ed4dbe88d5f39b")
      public override
          fun customerContentEncryptionConfiguration(customerContentEncryptionConfiguration: CustomerContentEncryptionConfigurationProperty.Builder.() -> Unit):
          Unit =
          customerContentEncryptionConfiguration(CustomerContentEncryptionConfigurationProperty(customerContentEncryptionConfiguration))

      public override fun enforceWorkGroupConfiguration(enforceWorkGroupConfiguration: Boolean) {
        cdkBuilder.enforceWorkGroupConfiguration(enforceWorkGroupConfiguration)
      }

      public override
          fun enforceWorkGroupConfiguration(enforceWorkGroupConfiguration: IResolvable) {
        cdkBuilder.enforceWorkGroupConfiguration(enforceWorkGroupConfiguration.let(IResolvable::unwrap))
      }

      public override fun engineVersion(engineVersion: IResolvable) {
        cdkBuilder.engineVersion(engineVersion.let(IResolvable::unwrap))
      }

      public override fun engineVersion(engineVersion: EngineVersionProperty) {
        cdkBuilder.engineVersion(engineVersion.let(EngineVersionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0b286f7f543152c6f37cc53f1379386fbf11a01c719cab1ead34d128875b08eb")
      public override fun engineVersion(engineVersion: EngineVersionProperty.Builder.() -> Unit):
          Unit = engineVersion(EngineVersionProperty(engineVersion))

      public override fun executionRole(executionRole: String) {
        cdkBuilder.executionRole(executionRole)
      }

      public override
          fun publishCloudWatchMetricsEnabled(publishCloudWatchMetricsEnabled: Boolean) {
        cdkBuilder.publishCloudWatchMetricsEnabled(publishCloudWatchMetricsEnabled)
      }

      public override
          fun publishCloudWatchMetricsEnabled(publishCloudWatchMetricsEnabled: IResolvable) {
        cdkBuilder.publishCloudWatchMetricsEnabled(publishCloudWatchMetricsEnabled.let(IResolvable::unwrap))
      }

      public override
          fun removeBytesScannedCutoffPerQuery(removeBytesScannedCutoffPerQuery: Boolean) {
        cdkBuilder.removeBytesScannedCutoffPerQuery(removeBytesScannedCutoffPerQuery)
      }

      public override
          fun removeBytesScannedCutoffPerQuery(removeBytesScannedCutoffPerQuery: IResolvable) {
        cdkBuilder.removeBytesScannedCutoffPerQuery(removeBytesScannedCutoffPerQuery.let(IResolvable::unwrap))
      }

      public override
          fun removeCustomerContentEncryptionConfiguration(removeCustomerContentEncryptionConfiguration: Boolean) {
        cdkBuilder.removeCustomerContentEncryptionConfiguration(removeCustomerContentEncryptionConfiguration)
      }

      public override
          fun removeCustomerContentEncryptionConfiguration(removeCustomerContentEncryptionConfiguration: IResolvable) {
        cdkBuilder.removeCustomerContentEncryptionConfiguration(removeCustomerContentEncryptionConfiguration.let(IResolvable::unwrap))
      }

      public override fun requesterPaysEnabled(requesterPaysEnabled: Boolean) {
        cdkBuilder.requesterPaysEnabled(requesterPaysEnabled)
      }

      public override fun requesterPaysEnabled(requesterPaysEnabled: IResolvable) {
        cdkBuilder.requesterPaysEnabled(requesterPaysEnabled.let(IResolvable::unwrap))
      }

      public override fun resultConfigurationUpdates(resultConfigurationUpdates: IResolvable) {
        cdkBuilder.resultConfigurationUpdates(resultConfigurationUpdates.let(IResolvable::unwrap))
      }

      public override
          fun resultConfigurationUpdates(resultConfigurationUpdates: ResultConfigurationUpdatesProperty) {
        cdkBuilder.resultConfigurationUpdates(resultConfigurationUpdates.let(ResultConfigurationUpdatesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac011ddfd0736211190b806a9feab225d5f224d06c649c15660ec65cbe3cd716")
      public override
          fun resultConfigurationUpdates(resultConfigurationUpdates: ResultConfigurationUpdatesProperty.Builder.() -> Unit):
          Unit =
          resultConfigurationUpdates(ResultConfigurationUpdatesProperty(resultConfigurationUpdates))

      public fun build():
          software.amazon.awscdk.services.athena.CfnWorkGroup.WorkGroupConfigurationUpdatesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.athena.CfnWorkGroup.WorkGroupConfigurationUpdatesProperty,
    ) : WorkGroupConfigurationUpdatesProperty {
      public override fun additionalConfiguration(): String? =
          unwrap(this).getAdditionalConfiguration()

      public override fun bytesScannedCutoffPerQuery(): Number? =
          unwrap(this).getBytesScannedCutoffPerQuery()

      public override fun customerContentEncryptionConfiguration(): Any? =
          unwrap(this).getCustomerContentEncryptionConfiguration()

      public override fun enforceWorkGroupConfiguration(): Any? =
          unwrap(this).getEnforceWorkGroupConfiguration()

      public override fun engineVersion(): Any? = unwrap(this).getEngineVersion()

      public override fun executionRole(): String? = unwrap(this).getExecutionRole()

      public override fun publishCloudWatchMetricsEnabled(): Any? =
          unwrap(this).getPublishCloudWatchMetricsEnabled()

      public override fun removeBytesScannedCutoffPerQuery(): Any? =
          unwrap(this).getRemoveBytesScannedCutoffPerQuery()

      public override fun removeCustomerContentEncryptionConfiguration(): Any? =
          unwrap(this).getRemoveCustomerContentEncryptionConfiguration()

      public override fun requesterPaysEnabled(): Any? = unwrap(this).getRequesterPaysEnabled()

      public override fun resultConfigurationUpdates(): Any? =
          unwrap(this).getResultConfigurationUpdates()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          WorkGroupConfigurationUpdatesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.athena.CfnWorkGroup.WorkGroupConfigurationUpdatesProperty):
          WorkGroupConfigurationUpdatesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WorkGroupConfigurationUpdatesProperty):
          software.amazon.awscdk.services.athena.CfnWorkGroup.WorkGroupConfigurationUpdatesProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AclConfigurationProperty {
    public fun s3AclOption(): String

    public interface Builder {
      public fun s3AclOption(s3AclOption: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.athena.CfnWorkGroup.AclConfigurationProperty.Builder =
          software.amazon.awscdk.services.athena.CfnWorkGroup.AclConfigurationProperty.builder()

      public override fun s3AclOption(s3AclOption: String) {
        cdkBuilder.s3AclOption(s3AclOption)
      }

      public fun build():
          software.amazon.awscdk.services.athena.CfnWorkGroup.AclConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.athena.CfnWorkGroup.AclConfigurationProperty,
    ) : AclConfigurationProperty {
      public override fun s3AclOption(): String = unwrap(this).getS3AclOption()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AclConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.athena.CfnWorkGroup.AclConfigurationProperty):
          AclConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AclConfigurationProperty):
          software.amazon.awscdk.services.athena.CfnWorkGroup.AclConfigurationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface WorkGroupConfigurationProperty {
    public fun additionalConfiguration(): String? = unwrap(this).getAdditionalConfiguration()

    public fun bytesScannedCutoffPerQuery(): Number? = unwrap(this).getBytesScannedCutoffPerQuery()

    public fun customerContentEncryptionConfiguration(): Any? =
        unwrap(this).getCustomerContentEncryptionConfiguration()

    public fun enforceWorkGroupConfiguration(): Any? =
        unwrap(this).getEnforceWorkGroupConfiguration()

    public fun engineVersion(): Any? = unwrap(this).getEngineVersion()

    public fun executionRole(): String? = unwrap(this).getExecutionRole()

    public fun publishCloudWatchMetricsEnabled(): Any? =
        unwrap(this).getPublishCloudWatchMetricsEnabled()

    public fun requesterPaysEnabled(): Any? = unwrap(this).getRequesterPaysEnabled()

    public fun resultConfiguration(): Any? = unwrap(this).getResultConfiguration()

    public interface Builder {
      public fun additionalConfiguration(additionalConfiguration: String) {
      }

      public fun bytesScannedCutoffPerQuery(bytesScannedCutoffPerQuery: Number) {
      }

      public
          fun customerContentEncryptionConfiguration(customerContentEncryptionConfiguration: IResolvable) {
      }

      public
          fun customerContentEncryptionConfiguration(customerContentEncryptionConfiguration: CustomerContentEncryptionConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e01ac5be3f4a3b617ab2842bacda21ef62ab41b6c08d71da726816a38ae7dd21")
      public
          fun customerContentEncryptionConfiguration(customerContentEncryptionConfiguration: CustomerContentEncryptionConfigurationProperty.Builder.() -> Unit) {
      }

      public fun enforceWorkGroupConfiguration(enforceWorkGroupConfiguration: Boolean) {
      }

      public fun enforceWorkGroupConfiguration(enforceWorkGroupConfiguration: IResolvable) {
      }

      public fun engineVersion(engineVersion: IResolvable) {
      }

      public fun engineVersion(engineVersion: EngineVersionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5983b34c50cefc1520e086b9661c01dfbc1ff46adf18519e782eb7e545b2c902")
      public fun engineVersion(engineVersion: EngineVersionProperty.Builder.() -> Unit) {
      }

      public fun executionRole(executionRole: String) {
      }

      public fun publishCloudWatchMetricsEnabled(publishCloudWatchMetricsEnabled: Boolean) {
      }

      public fun publishCloudWatchMetricsEnabled(publishCloudWatchMetricsEnabled: IResolvable) {
      }

      public fun requesterPaysEnabled(requesterPaysEnabled: Boolean) {
      }

      public fun requesterPaysEnabled(requesterPaysEnabled: IResolvable) {
      }

      public fun resultConfiguration(resultConfiguration: IResolvable) {
      }

      public fun resultConfiguration(resultConfiguration: ResultConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("004561fbbfbe6dec63a390996bb2a4f0182fb92a2a15d27e6386401a651aca7d")
      public
          fun resultConfiguration(resultConfiguration: ResultConfigurationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.athena.CfnWorkGroup.WorkGroupConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.athena.CfnWorkGroup.WorkGroupConfigurationProperty.builder()

      public override fun additionalConfiguration(additionalConfiguration: String) {
        cdkBuilder.additionalConfiguration(additionalConfiguration)
      }

      public override fun bytesScannedCutoffPerQuery(bytesScannedCutoffPerQuery: Number) {
        cdkBuilder.bytesScannedCutoffPerQuery(bytesScannedCutoffPerQuery)
      }

      public override
          fun customerContentEncryptionConfiguration(customerContentEncryptionConfiguration: IResolvable) {
        cdkBuilder.customerContentEncryptionConfiguration(customerContentEncryptionConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun customerContentEncryptionConfiguration(customerContentEncryptionConfiguration: CustomerContentEncryptionConfigurationProperty) {
        cdkBuilder.customerContentEncryptionConfiguration(customerContentEncryptionConfiguration.let(CustomerContentEncryptionConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e01ac5be3f4a3b617ab2842bacda21ef62ab41b6c08d71da726816a38ae7dd21")
      public override
          fun customerContentEncryptionConfiguration(customerContentEncryptionConfiguration: CustomerContentEncryptionConfigurationProperty.Builder.() -> Unit):
          Unit =
          customerContentEncryptionConfiguration(CustomerContentEncryptionConfigurationProperty(customerContentEncryptionConfiguration))

      public override fun enforceWorkGroupConfiguration(enforceWorkGroupConfiguration: Boolean) {
        cdkBuilder.enforceWorkGroupConfiguration(enforceWorkGroupConfiguration)
      }

      public override
          fun enforceWorkGroupConfiguration(enforceWorkGroupConfiguration: IResolvable) {
        cdkBuilder.enforceWorkGroupConfiguration(enforceWorkGroupConfiguration.let(IResolvable::unwrap))
      }

      public override fun engineVersion(engineVersion: IResolvable) {
        cdkBuilder.engineVersion(engineVersion.let(IResolvable::unwrap))
      }

      public override fun engineVersion(engineVersion: EngineVersionProperty) {
        cdkBuilder.engineVersion(engineVersion.let(EngineVersionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5983b34c50cefc1520e086b9661c01dfbc1ff46adf18519e782eb7e545b2c902")
      public override fun engineVersion(engineVersion: EngineVersionProperty.Builder.() -> Unit):
          Unit = engineVersion(EngineVersionProperty(engineVersion))

      public override fun executionRole(executionRole: String) {
        cdkBuilder.executionRole(executionRole)
      }

      public override
          fun publishCloudWatchMetricsEnabled(publishCloudWatchMetricsEnabled: Boolean) {
        cdkBuilder.publishCloudWatchMetricsEnabled(publishCloudWatchMetricsEnabled)
      }

      public override
          fun publishCloudWatchMetricsEnabled(publishCloudWatchMetricsEnabled: IResolvable) {
        cdkBuilder.publishCloudWatchMetricsEnabled(publishCloudWatchMetricsEnabled.let(IResolvable::unwrap))
      }

      public override fun requesterPaysEnabled(requesterPaysEnabled: Boolean) {
        cdkBuilder.requesterPaysEnabled(requesterPaysEnabled)
      }

      public override fun requesterPaysEnabled(requesterPaysEnabled: IResolvable) {
        cdkBuilder.requesterPaysEnabled(requesterPaysEnabled.let(IResolvable::unwrap))
      }

      public override fun resultConfiguration(resultConfiguration: IResolvable) {
        cdkBuilder.resultConfiguration(resultConfiguration.let(IResolvable::unwrap))
      }

      public override fun resultConfiguration(resultConfiguration: ResultConfigurationProperty) {
        cdkBuilder.resultConfiguration(resultConfiguration.let(ResultConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("004561fbbfbe6dec63a390996bb2a4f0182fb92a2a15d27e6386401a651aca7d")
      public override
          fun resultConfiguration(resultConfiguration: ResultConfigurationProperty.Builder.() -> Unit):
          Unit = resultConfiguration(ResultConfigurationProperty(resultConfiguration))

      public fun build():
          software.amazon.awscdk.services.athena.CfnWorkGroup.WorkGroupConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.athena.CfnWorkGroup.WorkGroupConfigurationProperty,
    ) : WorkGroupConfigurationProperty {
      public override fun additionalConfiguration(): String? =
          unwrap(this).getAdditionalConfiguration()

      public override fun bytesScannedCutoffPerQuery(): Number? =
          unwrap(this).getBytesScannedCutoffPerQuery()

      public override fun customerContentEncryptionConfiguration(): Any? =
          unwrap(this).getCustomerContentEncryptionConfiguration()

      public override fun enforceWorkGroupConfiguration(): Any? =
          unwrap(this).getEnforceWorkGroupConfiguration()

      public override fun engineVersion(): Any? = unwrap(this).getEngineVersion()

      public override fun executionRole(): String? = unwrap(this).getExecutionRole()

      public override fun publishCloudWatchMetricsEnabled(): Any? =
          unwrap(this).getPublishCloudWatchMetricsEnabled()

      public override fun requesterPaysEnabled(): Any? = unwrap(this).getRequesterPaysEnabled()

      public override fun resultConfiguration(): Any? = unwrap(this).getResultConfiguration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): WorkGroupConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.athena.CfnWorkGroup.WorkGroupConfigurationProperty):
          WorkGroupConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WorkGroupConfigurationProperty):
          software.amazon.awscdk.services.athena.CfnWorkGroup.WorkGroupConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface EncryptionConfigurationProperty {
    public fun encryptionOption(): String

    public fun kmsKey(): String? = unwrap(this).getKmsKey()

    public interface Builder {
      public fun encryptionOption(encryptionOption: String) {
      }

      public fun kmsKey(kmsKey: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.athena.CfnWorkGroup.EncryptionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.athena.CfnWorkGroup.EncryptionConfigurationProperty.builder()

      public override fun encryptionOption(encryptionOption: String) {
        cdkBuilder.encryptionOption(encryptionOption)
      }

      public override fun kmsKey(kmsKey: String) {
        cdkBuilder.kmsKey(kmsKey)
      }

      public fun build():
          software.amazon.awscdk.services.athena.CfnWorkGroup.EncryptionConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.athena.CfnWorkGroup.EncryptionConfigurationProperty,
    ) : EncryptionConfigurationProperty {
      public override fun encryptionOption(): String = unwrap(this).getEncryptionOption()

      public override fun kmsKey(): String? = unwrap(this).getKmsKey()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.athena.CfnWorkGroup.EncryptionConfigurationProperty):
          EncryptionConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionConfigurationProperty):
          software.amazon.awscdk.services.athena.CfnWorkGroup.EncryptionConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CustomerContentEncryptionConfigurationProperty {
    public fun kmsKey(): String

    public interface Builder {
      public fun kmsKey(kmsKey: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.athena.CfnWorkGroup.CustomerContentEncryptionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.athena.CfnWorkGroup.CustomerContentEncryptionConfigurationProperty.builder()

      public override fun kmsKey(kmsKey: String) {
        cdkBuilder.kmsKey(kmsKey)
      }

      public fun build():
          software.amazon.awscdk.services.athena.CfnWorkGroup.CustomerContentEncryptionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.athena.CfnWorkGroup.CustomerContentEncryptionConfigurationProperty,
    ) : CustomerContentEncryptionConfigurationProperty {
      public override fun kmsKey(): String = unwrap(this).getKmsKey()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          CustomerContentEncryptionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.athena.CfnWorkGroup.CustomerContentEncryptionConfigurationProperty):
          CustomerContentEncryptionConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomerContentEncryptionConfigurationProperty):
          software.amazon.awscdk.services.athena.CfnWorkGroup.CustomerContentEncryptionConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
