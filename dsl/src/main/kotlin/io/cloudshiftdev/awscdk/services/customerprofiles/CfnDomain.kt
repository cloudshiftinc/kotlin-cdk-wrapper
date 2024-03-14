package io.cloudshiftdev.awscdk.services.customerprofiles

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDomain internal constructor(
  private val cdkObject: software.amazon.awscdk.services.customerprofiles.CfnDomain,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  public open fun attrLastUpdatedAt(): String = unwrap(this).getAttrLastUpdatedAt()

  public open fun attrRuleBasedMatchingStatus(): String =
      unwrap(this).getAttrRuleBasedMatchingStatus()

  public open fun attrStats(): IResolvable = unwrap(this).getAttrStats().let(IResolvable::wrap)

  public open fun deadLetterQueueUrl(): String? = unwrap(this).getDeadLetterQueueUrl()

  public open fun deadLetterQueueUrl(`value`: String) {
    unwrap(this).setDeadLetterQueueUrl(`value`)
  }

  public open fun defaultEncryptionKey(): String? = unwrap(this).getDefaultEncryptionKey()

  public open fun defaultEncryptionKey(`value`: String) {
    unwrap(this).setDefaultEncryptionKey(`value`)
  }

  public open fun defaultExpirationDays(): Number = unwrap(this).getDefaultExpirationDays()

  public open fun defaultExpirationDays(`value`: Number) {
    unwrap(this).setDefaultExpirationDays(`value`)
  }

  public open fun domainName(): String = unwrap(this).getDomainName()

  public open fun domainName(`value`: String) {
    unwrap(this).setDomainName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun matching(): Any? = unwrap(this).getMatching()

  public open fun matching(`value`: IResolvable) {
    unwrap(this).setMatching(`value`.let(IResolvable::unwrap))
  }

  public open fun matching(`value`: MatchingProperty) {
    unwrap(this).setMatching(`value`.let(MatchingProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("79b5098f940539e246e8bd2177c27653a198e3a5968b8a66e091896480569b87")
  public open fun matching(`value`: MatchingProperty.Builder.() -> Unit): Unit =
      matching(MatchingProperty(`value`))

  public open fun ruleBasedMatching(): Any? = unwrap(this).getRuleBasedMatching()

  public open fun ruleBasedMatching(`value`: IResolvable) {
    unwrap(this).setRuleBasedMatching(`value`.let(IResolvable::unwrap))
  }

  public open fun ruleBasedMatching(`value`: RuleBasedMatchingProperty) {
    unwrap(this).setRuleBasedMatching(`value`.let(RuleBasedMatchingProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8d664378f35733db769b89be93076878909cb45db0a43a2f608ea1f8d4a99348")
  public open fun ruleBasedMatching(`value`: RuleBasedMatchingProperty.Builder.() -> Unit): Unit =
      ruleBasedMatching(RuleBasedMatchingProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun deadLetterQueueUrl(deadLetterQueueUrl: String) {
    }

    public fun defaultEncryptionKey(defaultEncryptionKey: String) {
    }

    public fun defaultExpirationDays(defaultExpirationDays: Number) {
    }

    public fun domainName(domainName: String) {
    }

    public fun matching(matching: IResolvable) {
    }

    public fun matching(matching: MatchingProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e38458ae34c1765a7a7e49301316b30b82fdfd804502c05ef8e5ec16df7b4655")
    public fun matching(matching: MatchingProperty.Builder.() -> Unit) {
    }

    public fun ruleBasedMatching(ruleBasedMatching: IResolvable) {
    }

    public fun ruleBasedMatching(ruleBasedMatching: RuleBasedMatchingProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad6c8326479fec31d0175a3f92ce3ffe573427cf4bb03162d5bf5e7ced4837bc")
    public fun ruleBasedMatching(ruleBasedMatching: RuleBasedMatchingProperty.Builder.() -> Unit) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.customerprofiles.CfnDomain.Builder =
        software.amazon.awscdk.services.customerprofiles.CfnDomain.Builder.create(scope, id)

    public override fun deadLetterQueueUrl(deadLetterQueueUrl: String) {
      cdkBuilder.deadLetterQueueUrl(deadLetterQueueUrl)
    }

    public override fun defaultEncryptionKey(defaultEncryptionKey: String) {
      cdkBuilder.defaultEncryptionKey(defaultEncryptionKey)
    }

    public override fun defaultExpirationDays(defaultExpirationDays: Number) {
      cdkBuilder.defaultExpirationDays(defaultExpirationDays)
    }

    public override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    public override fun matching(matching: IResolvable) {
      cdkBuilder.matching(matching.let(IResolvable::unwrap))
    }

    public override fun matching(matching: MatchingProperty) {
      cdkBuilder.matching(matching.let(MatchingProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e38458ae34c1765a7a7e49301316b30b82fdfd804502c05ef8e5ec16df7b4655")
    public override fun matching(matching: MatchingProperty.Builder.() -> Unit): Unit =
        matching(MatchingProperty(matching))

    public override fun ruleBasedMatching(ruleBasedMatching: IResolvable) {
      cdkBuilder.ruleBasedMatching(ruleBasedMatching.let(IResolvable::unwrap))
    }

    public override fun ruleBasedMatching(ruleBasedMatching: RuleBasedMatchingProperty) {
      cdkBuilder.ruleBasedMatching(ruleBasedMatching.let(RuleBasedMatchingProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad6c8326479fec31d0175a3f92ce3ffe573427cf4bb03162d5bf5e7ced4837bc")
    public override
        fun ruleBasedMatching(ruleBasedMatching: RuleBasedMatchingProperty.Builder.() -> Unit): Unit
        = ruleBasedMatching(RuleBasedMatchingProperty(ruleBasedMatching))

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.customerprofiles.CfnDomain =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDomain {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDomain(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnDomain):
        CfnDomain = CfnDomain(cdkObject)

    internal fun unwrap(wrapped: CfnDomain):
        software.amazon.awscdk.services.customerprofiles.CfnDomain = wrapped.cdkObject
  }

  public interface S3ExportingConfigProperty {
    public fun s3BucketName(): String

    public fun s3KeyName(): String? = unwrap(this).getS3KeyName()

    public interface Builder {
      public fun s3BucketName(s3BucketName: String) {
      }

      public fun s3KeyName(s3KeyName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnDomain.S3ExportingConfigProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnDomain.S3ExportingConfigProperty.builder()

      public override fun s3BucketName(s3BucketName: String) {
        cdkBuilder.s3BucketName(s3BucketName)
      }

      public override fun s3KeyName(s3KeyName: String) {
        cdkBuilder.s3KeyName(s3KeyName)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnDomain.S3ExportingConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnDomain.S3ExportingConfigProperty,
    ) : S3ExportingConfigProperty {
      public override fun s3BucketName(): String = unwrap(this).getS3BucketName()

      public override fun s3KeyName(): String? = unwrap(this).getS3KeyName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3ExportingConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnDomain.S3ExportingConfigProperty):
          S3ExportingConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3ExportingConfigProperty):
          software.amazon.awscdk.services.customerprofiles.CfnDomain.S3ExportingConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AutoMergingProperty {
    public fun conflictResolution(): Any? = unwrap(this).getConflictResolution()

    public fun consolidation(): Any? = unwrap(this).getConsolidation()

    public fun enabled(): Any

    public fun minAllowedConfidenceScoreForMerging(): Number? =
        unwrap(this).getMinAllowedConfidenceScoreForMerging()

    public interface Builder {
      public fun conflictResolution(conflictResolution: IResolvable) {
      }

      public fun conflictResolution(conflictResolution: ConflictResolutionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a5ccb8bda605b8c0ced514db1ddecb795bb5dafb1a21230a08e064f1dcf1bd7e")
      public
          fun conflictResolution(conflictResolution: ConflictResolutionProperty.Builder.() -> Unit) {
      }

      public fun consolidation(consolidation: IResolvable) {
      }

      public fun consolidation(consolidation: ConsolidationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("588475a49e8665372eaaf66d60a9ace54fcd7d2dcd66c30f0ad94144aa78d90d")
      public fun consolidation(consolidation: ConsolidationProperty.Builder.() -> Unit) {
      }

      public fun enabled(enabled: Boolean) {
      }

      public fun enabled(enabled: IResolvable) {
      }

      public fun minAllowedConfidenceScoreForMerging(minAllowedConfidenceScoreForMerging: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnDomain.AutoMergingProperty.Builder =
          software.amazon.awscdk.services.customerprofiles.CfnDomain.AutoMergingProperty.builder()

      public override fun conflictResolution(conflictResolution: IResolvable) {
        cdkBuilder.conflictResolution(conflictResolution.let(IResolvable::unwrap))
      }

      public override fun conflictResolution(conflictResolution: ConflictResolutionProperty) {
        cdkBuilder.conflictResolution(conflictResolution.let(ConflictResolutionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a5ccb8bda605b8c0ced514db1ddecb795bb5dafb1a21230a08e064f1dcf1bd7e")
      public override
          fun conflictResolution(conflictResolution: ConflictResolutionProperty.Builder.() -> Unit):
          Unit = conflictResolution(ConflictResolutionProperty(conflictResolution))

      public override fun consolidation(consolidation: IResolvable) {
        cdkBuilder.consolidation(consolidation.let(IResolvable::unwrap))
      }

      public override fun consolidation(consolidation: ConsolidationProperty) {
        cdkBuilder.consolidation(consolidation.let(ConsolidationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("588475a49e8665372eaaf66d60a9ace54fcd7d2dcd66c30f0ad94144aa78d90d")
      public override fun consolidation(consolidation: ConsolidationProperty.Builder.() -> Unit):
          Unit = consolidation(ConsolidationProperty(consolidation))

      public override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      public override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public override
          fun minAllowedConfidenceScoreForMerging(minAllowedConfidenceScoreForMerging: Number) {
        cdkBuilder.minAllowedConfidenceScoreForMerging(minAllowedConfidenceScoreForMerging)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnDomain.AutoMergingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnDomain.AutoMergingProperty,
    ) : AutoMergingProperty {
      public override fun conflictResolution(): Any? = unwrap(this).getConflictResolution()

      public override fun consolidation(): Any? = unwrap(this).getConsolidation()

      public override fun enabled(): Any = unwrap(this).getEnabled()

      public override fun minAllowedConfidenceScoreForMerging(): Number? =
          unwrap(this).getMinAllowedConfidenceScoreForMerging()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AutoMergingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnDomain.AutoMergingProperty):
          AutoMergingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutoMergingProperty):
          software.amazon.awscdk.services.customerprofiles.CfnDomain.AutoMergingProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface RuleBasedMatchingProperty {
    public fun attributeTypesSelector(): Any? = unwrap(this).getAttributeTypesSelector()

    public fun conflictResolution(): Any? = unwrap(this).getConflictResolution()

    public fun enabled(): Any

    public fun exportingConfig(): Any? = unwrap(this).getExportingConfig()

    public fun matchingRules(): Any? = unwrap(this).getMatchingRules()

    public fun maxAllowedRuleLevelForMatching(): Number? =
        unwrap(this).getMaxAllowedRuleLevelForMatching()

    public fun maxAllowedRuleLevelForMerging(): Number? =
        unwrap(this).getMaxAllowedRuleLevelForMerging()

    public fun status(): String? = unwrap(this).getStatus()

    public interface Builder {
      public fun attributeTypesSelector(attributeTypesSelector: IResolvable) {
      }

      public fun attributeTypesSelector(attributeTypesSelector: AttributeTypesSelectorProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("384295a2d64f6e20fa9fdd4eff187f211054525d9c5899874c59c253ef9b3909")
      public
          fun attributeTypesSelector(attributeTypesSelector: AttributeTypesSelectorProperty.Builder.() -> Unit) {
      }

      public fun conflictResolution(conflictResolution: IResolvable) {
      }

      public fun conflictResolution(conflictResolution: ConflictResolutionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("93ec69cbddffcd12af33b57f49d61f338305f823b557ca488dc39f2b24b247bf")
      public
          fun conflictResolution(conflictResolution: ConflictResolutionProperty.Builder.() -> Unit) {
      }

      public fun enabled(enabled: Boolean) {
      }

      public fun enabled(enabled: IResolvable) {
      }

      public fun exportingConfig(exportingConfig: IResolvable) {
      }

      public fun exportingConfig(exportingConfig: ExportingConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3ae8dd681fa699bfc90a4ced2542f77bd9e133e50290bb6967915d30a976a5b7")
      public fun exportingConfig(exportingConfig: ExportingConfigProperty.Builder.() -> Unit) {
      }

      public fun matchingRules(matchingRules: IResolvable) {
      }

      public fun matchingRules(matchingRules: List<Any>) {
      }

      public fun maxAllowedRuleLevelForMatching(maxAllowedRuleLevelForMatching: Number) {
      }

      public fun maxAllowedRuleLevelForMerging(maxAllowedRuleLevelForMerging: Number) {
      }

      public fun status(status: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnDomain.RuleBasedMatchingProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnDomain.RuleBasedMatchingProperty.builder()

      public override fun attributeTypesSelector(attributeTypesSelector: IResolvable) {
        cdkBuilder.attributeTypesSelector(attributeTypesSelector.let(IResolvable::unwrap))
      }

      public override
          fun attributeTypesSelector(attributeTypesSelector: AttributeTypesSelectorProperty) {
        cdkBuilder.attributeTypesSelector(attributeTypesSelector.let(AttributeTypesSelectorProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("384295a2d64f6e20fa9fdd4eff187f211054525d9c5899874c59c253ef9b3909")
      public override
          fun attributeTypesSelector(attributeTypesSelector: AttributeTypesSelectorProperty.Builder.() -> Unit):
          Unit = attributeTypesSelector(AttributeTypesSelectorProperty(attributeTypesSelector))

      public override fun conflictResolution(conflictResolution: IResolvable) {
        cdkBuilder.conflictResolution(conflictResolution.let(IResolvable::unwrap))
      }

      public override fun conflictResolution(conflictResolution: ConflictResolutionProperty) {
        cdkBuilder.conflictResolution(conflictResolution.let(ConflictResolutionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("93ec69cbddffcd12af33b57f49d61f338305f823b557ca488dc39f2b24b247bf")
      public override
          fun conflictResolution(conflictResolution: ConflictResolutionProperty.Builder.() -> Unit):
          Unit = conflictResolution(ConflictResolutionProperty(conflictResolution))

      public override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      public override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public override fun exportingConfig(exportingConfig: IResolvable) {
        cdkBuilder.exportingConfig(exportingConfig.let(IResolvable::unwrap))
      }

      public override fun exportingConfig(exportingConfig: ExportingConfigProperty) {
        cdkBuilder.exportingConfig(exportingConfig.let(ExportingConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3ae8dd681fa699bfc90a4ced2542f77bd9e133e50290bb6967915d30a976a5b7")
      public override
          fun exportingConfig(exportingConfig: ExportingConfigProperty.Builder.() -> Unit): Unit =
          exportingConfig(ExportingConfigProperty(exportingConfig))

      public override fun matchingRules(matchingRules: IResolvable) {
        cdkBuilder.matchingRules(matchingRules.let(IResolvable::unwrap))
      }

      public override fun matchingRules(matchingRules: List<Any>) {
        cdkBuilder.matchingRules(matchingRules)
      }

      public override fun maxAllowedRuleLevelForMatching(maxAllowedRuleLevelForMatching: Number) {
        cdkBuilder.maxAllowedRuleLevelForMatching(maxAllowedRuleLevelForMatching)
      }

      public override fun maxAllowedRuleLevelForMerging(maxAllowedRuleLevelForMerging: Number) {
        cdkBuilder.maxAllowedRuleLevelForMerging(maxAllowedRuleLevelForMerging)
      }

      public override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnDomain.RuleBasedMatchingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnDomain.RuleBasedMatchingProperty,
    ) : RuleBasedMatchingProperty {
      public override fun attributeTypesSelector(): Any? = unwrap(this).getAttributeTypesSelector()

      public override fun conflictResolution(): Any? = unwrap(this).getConflictResolution()

      public override fun enabled(): Any = unwrap(this).getEnabled()

      public override fun exportingConfig(): Any? = unwrap(this).getExportingConfig()

      public override fun matchingRules(): Any? = unwrap(this).getMatchingRules()

      public override fun maxAllowedRuleLevelForMatching(): Number? =
          unwrap(this).getMaxAllowedRuleLevelForMatching()

      public override fun maxAllowedRuleLevelForMerging(): Number? =
          unwrap(this).getMaxAllowedRuleLevelForMerging()

      public override fun status(): String? = unwrap(this).getStatus()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RuleBasedMatchingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnDomain.RuleBasedMatchingProperty):
          RuleBasedMatchingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleBasedMatchingProperty):
          software.amazon.awscdk.services.customerprofiles.CfnDomain.RuleBasedMatchingProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MatchingProperty {
    public fun autoMerging(): Any? = unwrap(this).getAutoMerging()

    public fun enabled(): Any

    public fun exportingConfig(): Any? = unwrap(this).getExportingConfig()

    public fun jobSchedule(): Any? = unwrap(this).getJobSchedule()

    public interface Builder {
      public fun autoMerging(autoMerging: IResolvable) {
      }

      public fun autoMerging(autoMerging: AutoMergingProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("006c8afb155ab17de412e5eced95bbf709a1b974ded50cbc76bfc3401e13b256")
      public fun autoMerging(autoMerging: AutoMergingProperty.Builder.() -> Unit) {
      }

      public fun enabled(enabled: Boolean) {
      }

      public fun enabled(enabled: IResolvable) {
      }

      public fun exportingConfig(exportingConfig: IResolvable) {
      }

      public fun exportingConfig(exportingConfig: ExportingConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e4cec075da95f0eaaee5ce2d281806dd984b8c1307ef88f39332d60fb47da8dc")
      public fun exportingConfig(exportingConfig: ExportingConfigProperty.Builder.() -> Unit) {
      }

      public fun jobSchedule(jobSchedule: IResolvable) {
      }

      public fun jobSchedule(jobSchedule: JobScheduleProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c9b628426b7ed68c60c13c72d013513ebf9e5810bee900c1197cfa87ba054cc1")
      public fun jobSchedule(jobSchedule: JobScheduleProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnDomain.MatchingProperty.Builder =
          software.amazon.awscdk.services.customerprofiles.CfnDomain.MatchingProperty.builder()

      public override fun autoMerging(autoMerging: IResolvable) {
        cdkBuilder.autoMerging(autoMerging.let(IResolvable::unwrap))
      }

      public override fun autoMerging(autoMerging: AutoMergingProperty) {
        cdkBuilder.autoMerging(autoMerging.let(AutoMergingProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("006c8afb155ab17de412e5eced95bbf709a1b974ded50cbc76bfc3401e13b256")
      public override fun autoMerging(autoMerging: AutoMergingProperty.Builder.() -> Unit): Unit =
          autoMerging(AutoMergingProperty(autoMerging))

      public override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      public override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public override fun exportingConfig(exportingConfig: IResolvable) {
        cdkBuilder.exportingConfig(exportingConfig.let(IResolvable::unwrap))
      }

      public override fun exportingConfig(exportingConfig: ExportingConfigProperty) {
        cdkBuilder.exportingConfig(exportingConfig.let(ExportingConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e4cec075da95f0eaaee5ce2d281806dd984b8c1307ef88f39332d60fb47da8dc")
      public override
          fun exportingConfig(exportingConfig: ExportingConfigProperty.Builder.() -> Unit): Unit =
          exportingConfig(ExportingConfigProperty(exportingConfig))

      public override fun jobSchedule(jobSchedule: IResolvable) {
        cdkBuilder.jobSchedule(jobSchedule.let(IResolvable::unwrap))
      }

      public override fun jobSchedule(jobSchedule: JobScheduleProperty) {
        cdkBuilder.jobSchedule(jobSchedule.let(JobScheduleProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c9b628426b7ed68c60c13c72d013513ebf9e5810bee900c1197cfa87ba054cc1")
      public override fun jobSchedule(jobSchedule: JobScheduleProperty.Builder.() -> Unit): Unit =
          jobSchedule(JobScheduleProperty(jobSchedule))

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnDomain.MatchingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnDomain.MatchingProperty,
    ) : MatchingProperty {
      public override fun autoMerging(): Any? = unwrap(this).getAutoMerging()

      public override fun enabled(): Any = unwrap(this).getEnabled()

      public override fun exportingConfig(): Any? = unwrap(this).getExportingConfig()

      public override fun jobSchedule(): Any? = unwrap(this).getJobSchedule()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MatchingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnDomain.MatchingProperty):
          MatchingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MatchingProperty):
          software.amazon.awscdk.services.customerprofiles.CfnDomain.MatchingProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ConflictResolutionProperty {
    public fun conflictResolvingModel(): String

    public fun sourceName(): String? = unwrap(this).getSourceName()

    public interface Builder {
      public fun conflictResolvingModel(conflictResolvingModel: String) {
      }

      public fun sourceName(sourceName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnDomain.ConflictResolutionProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnDomain.ConflictResolutionProperty.builder()

      public override fun conflictResolvingModel(conflictResolvingModel: String) {
        cdkBuilder.conflictResolvingModel(conflictResolvingModel)
      }

      public override fun sourceName(sourceName: String) {
        cdkBuilder.sourceName(sourceName)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnDomain.ConflictResolutionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnDomain.ConflictResolutionProperty,
    ) : ConflictResolutionProperty {
      public override fun conflictResolvingModel(): String =
          unwrap(this).getConflictResolvingModel()

      public override fun sourceName(): String? = unwrap(this).getSourceName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ConflictResolutionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnDomain.ConflictResolutionProperty):
          ConflictResolutionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConflictResolutionProperty):
          software.amazon.awscdk.services.customerprofiles.CfnDomain.ConflictResolutionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ExportingConfigProperty {
    public fun s3Exporting(): Any? = unwrap(this).getS3Exporting()

    public interface Builder {
      public fun s3Exporting(s3Exporting: IResolvable) {
      }

      public fun s3Exporting(s3Exporting: S3ExportingConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("98229fa0b36a910e2b9314fa9ee3e949dfbc31df45f06105683d17c08005dede")
      public fun s3Exporting(s3Exporting: S3ExportingConfigProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnDomain.ExportingConfigProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnDomain.ExportingConfigProperty.builder()

      public override fun s3Exporting(s3Exporting: IResolvable) {
        cdkBuilder.s3Exporting(s3Exporting.let(IResolvable::unwrap))
      }

      public override fun s3Exporting(s3Exporting: S3ExportingConfigProperty) {
        cdkBuilder.s3Exporting(s3Exporting.let(S3ExportingConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("98229fa0b36a910e2b9314fa9ee3e949dfbc31df45f06105683d17c08005dede")
      public override fun s3Exporting(s3Exporting: S3ExportingConfigProperty.Builder.() -> Unit):
          Unit = s3Exporting(S3ExportingConfigProperty(s3Exporting))

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnDomain.ExportingConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnDomain.ExportingConfigProperty,
    ) : ExportingConfigProperty {
      public override fun s3Exporting(): Any? = unwrap(this).getS3Exporting()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ExportingConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnDomain.ExportingConfigProperty):
          ExportingConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExportingConfigProperty):
          software.amazon.awscdk.services.customerprofiles.CfnDomain.ExportingConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AttributeTypesSelectorProperty {
    public fun address(): List<String> = unwrap(this).getAddress() ?: emptyList()

    public fun attributeMatchingModel(): String

    public fun emailAddress(): List<String> = unwrap(this).getEmailAddress() ?: emptyList()

    public fun phoneNumber(): List<String> = unwrap(this).getPhoneNumber() ?: emptyList()

    public interface Builder {
      public fun address(address: List<String>) {
      }

      public fun attributeMatchingModel(attributeMatchingModel: String) {
      }

      public fun emailAddress(emailAddress: List<String>) {
      }

      public fun phoneNumber(phoneNumber: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnDomain.AttributeTypesSelectorProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnDomain.AttributeTypesSelectorProperty.builder()

      public override fun address(address: List<String>) {
        cdkBuilder.address(address)
      }

      public override fun attributeMatchingModel(attributeMatchingModel: String) {
        cdkBuilder.attributeMatchingModel(attributeMatchingModel)
      }

      public override fun emailAddress(emailAddress: List<String>) {
        cdkBuilder.emailAddress(emailAddress)
      }

      public override fun phoneNumber(phoneNumber: List<String>) {
        cdkBuilder.phoneNumber(phoneNumber)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnDomain.AttributeTypesSelectorProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnDomain.AttributeTypesSelectorProperty,
    ) : AttributeTypesSelectorProperty {
      public override fun address(): List<String> = unwrap(this).getAddress() ?: emptyList()

      public override fun attributeMatchingModel(): String =
          unwrap(this).getAttributeMatchingModel()

      public override fun emailAddress(): List<String> = unwrap(this).getEmailAddress() ?:
          emptyList()

      public override fun phoneNumber(): List<String> = unwrap(this).getPhoneNumber() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AttributeTypesSelectorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnDomain.AttributeTypesSelectorProperty):
          AttributeTypesSelectorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AttributeTypesSelectorProperty):
          software.amazon.awscdk.services.customerprofiles.CfnDomain.AttributeTypesSelectorProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ConsolidationProperty {
    public fun matchingAttributesList(): Any

    public interface Builder {
      public fun matchingAttributesList(matchingAttributesList: IResolvable) {
      }

      public fun matchingAttributesList(matchingAttributesList: List<List<String>>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnDomain.ConsolidationProperty.Builder =
          software.amazon.awscdk.services.customerprofiles.CfnDomain.ConsolidationProperty.builder()

      public override fun matchingAttributesList(matchingAttributesList: IResolvable) {
        cdkBuilder.matchingAttributesList(matchingAttributesList.let(IResolvable::unwrap))
      }

      public override fun matchingAttributesList(matchingAttributesList: List<List<String>>) {
        cdkBuilder.matchingAttributesList(matchingAttributesList)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnDomain.ConsolidationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnDomain.ConsolidationProperty,
    ) : ConsolidationProperty {
      public override fun matchingAttributesList(): Any = unwrap(this).getMatchingAttributesList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ConsolidationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnDomain.ConsolidationProperty):
          ConsolidationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConsolidationProperty):
          software.amazon.awscdk.services.customerprofiles.CfnDomain.ConsolidationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface JobScheduleProperty {
    public fun dayOfTheWeek(): String

    public fun time(): String

    public interface Builder {
      public fun dayOfTheWeek(dayOfTheWeek: String) {
      }

      public fun time(time: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnDomain.JobScheduleProperty.Builder =
          software.amazon.awscdk.services.customerprofiles.CfnDomain.JobScheduleProperty.builder()

      public override fun dayOfTheWeek(dayOfTheWeek: String) {
        cdkBuilder.dayOfTheWeek(dayOfTheWeek)
      }

      public override fun time(time: String) {
        cdkBuilder.time(time)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnDomain.JobScheduleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnDomain.JobScheduleProperty,
    ) : JobScheduleProperty {
      public override fun dayOfTheWeek(): String = unwrap(this).getDayOfTheWeek()

      public override fun time(): String = unwrap(this).getTime()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): JobScheduleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnDomain.JobScheduleProperty):
          JobScheduleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JobScheduleProperty):
          software.amazon.awscdk.services.customerprofiles.CfnDomain.JobScheduleProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface MatchingRuleProperty {
    public fun rule(): List<String>

    public interface Builder {
      public fun rule(rule: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnDomain.MatchingRuleProperty.Builder =
          software.amazon.awscdk.services.customerprofiles.CfnDomain.MatchingRuleProperty.builder()

      public override fun rule(rule: List<String>) {
        cdkBuilder.rule(rule)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnDomain.MatchingRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnDomain.MatchingRuleProperty,
    ) : MatchingRuleProperty {
      public override fun rule(): List<String> = unwrap(this).getRule() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MatchingRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnDomain.MatchingRuleProperty):
          MatchingRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MatchingRuleProperty):
          software.amazon.awscdk.services.customerprofiles.CfnDomain.MatchingRuleProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface DomainStatsProperty {
    public fun meteringProfileCount(): Number? = unwrap(this).getMeteringProfileCount()

    public fun objectCount(): Number? = unwrap(this).getObjectCount()

    public fun profileCount(): Number? = unwrap(this).getProfileCount()

    public fun totalSize(): Number? = unwrap(this).getTotalSize()

    public interface Builder {
      public fun meteringProfileCount(meteringProfileCount: Number) {
      }

      public fun objectCount(objectCount: Number) {
      }

      public fun profileCount(profileCount: Number) {
      }

      public fun totalSize(totalSize: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnDomain.DomainStatsProperty.Builder =
          software.amazon.awscdk.services.customerprofiles.CfnDomain.DomainStatsProperty.builder()

      public override fun meteringProfileCount(meteringProfileCount: Number) {
        cdkBuilder.meteringProfileCount(meteringProfileCount)
      }

      public override fun objectCount(objectCount: Number) {
        cdkBuilder.objectCount(objectCount)
      }

      public override fun profileCount(profileCount: Number) {
        cdkBuilder.profileCount(profileCount)
      }

      public override fun totalSize(totalSize: Number) {
        cdkBuilder.totalSize(totalSize)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnDomain.DomainStatsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnDomain.DomainStatsProperty,
    ) : DomainStatsProperty {
      public override fun meteringProfileCount(): Number? = unwrap(this).getMeteringProfileCount()

      public override fun objectCount(): Number? = unwrap(this).getObjectCount()

      public override fun profileCount(): Number? = unwrap(this).getProfileCount()

      public override fun totalSize(): Number? = unwrap(this).getTotalSize()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DomainStatsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnDomain.DomainStatsProperty):
          DomainStatsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DomainStatsProperty):
          software.amazon.awscdk.services.customerprofiles.CfnDomain.DomainStatsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
