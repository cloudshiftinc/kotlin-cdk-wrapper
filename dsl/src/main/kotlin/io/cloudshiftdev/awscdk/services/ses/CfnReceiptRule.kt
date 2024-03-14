package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnReceiptRule internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ses.CfnReceiptRule,
) : CfnResource(cdkObject), IInspectable {
  public open fun after(): String? = unwrap(this).getAfter()

  public open fun after(`value`: String) {
    unwrap(this).setAfter(`value`)
  }

  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun rule(): Any = unwrap(this).getRule()

  public open fun rule(`value`: IResolvable) {
    unwrap(this).setRule(`value`.let(IResolvable::unwrap))
  }

  public open fun rule(`value`: RuleProperty) {
    unwrap(this).setRule(`value`.let(RuleProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a76384e5dcab32725f75a952ba47ab4916c9cbed9c9c72a971ba8525237386f4")
  public open fun rule(`value`: RuleProperty.Builder.() -> Unit): Unit = rule(RuleProperty(`value`))

  public open fun ruleSetName(): String = unwrap(this).getRuleSetName()

  public open fun ruleSetName(`value`: String) {
    unwrap(this).setRuleSetName(`value`)
  }

  public interface Builder {
    public fun after(after: String)

    public fun rule(rule: IResolvable)

    public fun rule(rule: RuleProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8d1b403cdfc8768d3f05c8e81b7694f70ccaa205d6434a849f7d762c120d77f3")
    public fun rule(rule: RuleProperty.Builder.() -> Unit)

    public fun ruleSetName(ruleSetName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.CfnReceiptRule.Builder =
        software.amazon.awscdk.services.ses.CfnReceiptRule.Builder.create(scope, id)

    override fun after(after: String) {
      cdkBuilder.after(after)
    }

    override fun rule(rule: IResolvable) {
      cdkBuilder.rule(rule.let(IResolvable::unwrap))
    }

    override fun rule(rule: RuleProperty) {
      cdkBuilder.rule(rule.let(RuleProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8d1b403cdfc8768d3f05c8e81b7694f70ccaa205d6434a849f7d762c120d77f3")
    override fun rule(rule: RuleProperty.Builder.() -> Unit): Unit = rule(RuleProperty(rule))

    override fun ruleSetName(ruleSetName: String) {
      cdkBuilder.ruleSetName(ruleSetName)
    }

    public fun build(): software.amazon.awscdk.services.ses.CfnReceiptRule = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnReceiptRule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnReceiptRule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnReceiptRule): CfnReceiptRule
        = CfnReceiptRule(cdkObject)

    internal fun unwrap(wrapped: CfnReceiptRule): software.amazon.awscdk.services.ses.CfnReceiptRule
        = wrapped.cdkObject
  }

  public interface LambdaActionProperty {
    public fun functionArn(): String

    public fun invocationType(): String? = unwrap(this).getInvocationType()

    public fun topicArn(): String? = unwrap(this).getTopicArn()

    public interface Builder {
      public fun functionArn(functionArn: String)

      public fun invocationType(invocationType: String)

      public fun topicArn(topicArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnReceiptRule.LambdaActionProperty.Builder =
          software.amazon.awscdk.services.ses.CfnReceiptRule.LambdaActionProperty.builder()

      override fun functionArn(functionArn: String) {
        cdkBuilder.functionArn(functionArn)
      }

      override fun invocationType(invocationType: String) {
        cdkBuilder.invocationType(invocationType)
      }

      override fun topicArn(topicArn: String) {
        cdkBuilder.topicArn(topicArn)
      }

      public fun build(): software.amazon.awscdk.services.ses.CfnReceiptRule.LambdaActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ses.CfnReceiptRule.LambdaActionProperty,
    ) : LambdaActionProperty {
      override fun functionArn(): String = unwrap(this).getFunctionArn()

      override fun invocationType(): String? = unwrap(this).getInvocationType()

      override fun topicArn(): String? = unwrap(this).getTopicArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LambdaActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnReceiptRule.LambdaActionProperty):
          LambdaActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaActionProperty):
          software.amazon.awscdk.services.ses.CfnReceiptRule.LambdaActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface WorkmailActionProperty {
    public fun organizationArn(): String

    public fun topicArn(): String? = unwrap(this).getTopicArn()

    public interface Builder {
      public fun organizationArn(organizationArn: String)

      public fun topicArn(topicArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnReceiptRule.WorkmailActionProperty.Builder =
          software.amazon.awscdk.services.ses.CfnReceiptRule.WorkmailActionProperty.builder()

      override fun organizationArn(organizationArn: String) {
        cdkBuilder.organizationArn(organizationArn)
      }

      override fun topicArn(topicArn: String) {
        cdkBuilder.topicArn(topicArn)
      }

      public fun build(): software.amazon.awscdk.services.ses.CfnReceiptRule.WorkmailActionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ses.CfnReceiptRule.WorkmailActionProperty,
    ) : WorkmailActionProperty {
      override fun organizationArn(): String = unwrap(this).getOrganizationArn()

      override fun topicArn(): String? = unwrap(this).getTopicArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): WorkmailActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnReceiptRule.WorkmailActionProperty):
          WorkmailActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WorkmailActionProperty):
          software.amazon.awscdk.services.ses.CfnReceiptRule.WorkmailActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AddHeaderActionProperty {
    public fun headerName(): String

    public fun headerValue(): String

    public interface Builder {
      public fun headerName(headerName: String)

      public fun headerValue(headerValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnReceiptRule.AddHeaderActionProperty.Builder =
          software.amazon.awscdk.services.ses.CfnReceiptRule.AddHeaderActionProperty.builder()

      override fun headerName(headerName: String) {
        cdkBuilder.headerName(headerName)
      }

      override fun headerValue(headerValue: String) {
        cdkBuilder.headerValue(headerValue)
      }

      public fun build(): software.amazon.awscdk.services.ses.CfnReceiptRule.AddHeaderActionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ses.CfnReceiptRule.AddHeaderActionProperty,
    ) : AddHeaderActionProperty {
      override fun headerName(): String = unwrap(this).getHeaderName()

      override fun headerValue(): String = unwrap(this).getHeaderValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AddHeaderActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnReceiptRule.AddHeaderActionProperty):
          AddHeaderActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AddHeaderActionProperty):
          software.amazon.awscdk.services.ses.CfnReceiptRule.AddHeaderActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface S3ActionProperty {
    public fun bucketName(): String

    public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    public fun objectKeyPrefix(): String? = unwrap(this).getObjectKeyPrefix()

    public fun topicArn(): String? = unwrap(this).getTopicArn()

    public interface Builder {
      public fun bucketName(bucketName: String)

      public fun kmsKeyArn(kmsKeyArn: String)

      public fun objectKeyPrefix(objectKeyPrefix: String)

      public fun topicArn(topicArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnReceiptRule.S3ActionProperty.Builder =
          software.amazon.awscdk.services.ses.CfnReceiptRule.S3ActionProperty.builder()

      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      override fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
      }

      override fun objectKeyPrefix(objectKeyPrefix: String) {
        cdkBuilder.objectKeyPrefix(objectKeyPrefix)
      }

      override fun topicArn(topicArn: String) {
        cdkBuilder.topicArn(topicArn)
      }

      public fun build(): software.amazon.awscdk.services.ses.CfnReceiptRule.S3ActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.ses.CfnReceiptRule.S3ActionProperty,
    ) : S3ActionProperty {
      override fun bucketName(): String = unwrap(this).getBucketName()

      override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

      override fun objectKeyPrefix(): String? = unwrap(this).getObjectKeyPrefix()

      override fun topicArn(): String? = unwrap(this).getTopicArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3ActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnReceiptRule.S3ActionProperty):
          S3ActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3ActionProperty):
          software.amazon.awscdk.services.ses.CfnReceiptRule.S3ActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface BounceActionProperty {
    public fun message(): String

    public fun sender(): String

    public fun smtpReplyCode(): String

    public fun statusCode(): String? = unwrap(this).getStatusCode()

    public fun topicArn(): String? = unwrap(this).getTopicArn()

    public interface Builder {
      public fun message(message: String)

      public fun sender(sender: String)

      public fun smtpReplyCode(smtpReplyCode: String)

      public fun statusCode(statusCode: String)

      public fun topicArn(topicArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnReceiptRule.BounceActionProperty.Builder =
          software.amazon.awscdk.services.ses.CfnReceiptRule.BounceActionProperty.builder()

      override fun message(message: String) {
        cdkBuilder.message(message)
      }

      override fun sender(sender: String) {
        cdkBuilder.sender(sender)
      }

      override fun smtpReplyCode(smtpReplyCode: String) {
        cdkBuilder.smtpReplyCode(smtpReplyCode)
      }

      override fun statusCode(statusCode: String) {
        cdkBuilder.statusCode(statusCode)
      }

      override fun topicArn(topicArn: String) {
        cdkBuilder.topicArn(topicArn)
      }

      public fun build(): software.amazon.awscdk.services.ses.CfnReceiptRule.BounceActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ses.CfnReceiptRule.BounceActionProperty,
    ) : BounceActionProperty {
      override fun message(): String = unwrap(this).getMessage()

      override fun sender(): String = unwrap(this).getSender()

      override fun smtpReplyCode(): String = unwrap(this).getSmtpReplyCode()

      override fun statusCode(): String? = unwrap(this).getStatusCode()

      override fun topicArn(): String? = unwrap(this).getTopicArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BounceActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnReceiptRule.BounceActionProperty):
          BounceActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BounceActionProperty):
          software.amazon.awscdk.services.ses.CfnReceiptRule.BounceActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface RuleProperty {
    public fun actions(): Any? = unwrap(this).getActions()

    public fun enabled(): Any? = unwrap(this).getEnabled()

    public fun name(): String? = unwrap(this).getName()

    public fun recipients(): List<String> = unwrap(this).getRecipients() ?: emptyList()

    public fun scanEnabled(): Any? = unwrap(this).getScanEnabled()

    public fun tlsPolicy(): String? = unwrap(this).getTlsPolicy()

    public interface Builder {
      public fun actions(actions: IResolvable)

      public fun actions(actions: List<Any>)

      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)

      public fun name(name: String)

      public fun recipients(recipients: List<String>)

      public fun scanEnabled(scanEnabled: Boolean)

      public fun scanEnabled(scanEnabled: IResolvable)

      public fun tlsPolicy(tlsPolicy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnReceiptRule.RuleProperty.Builder =
          software.amazon.awscdk.services.ses.CfnReceiptRule.RuleProperty.builder()

      override fun actions(actions: IResolvable) {
        cdkBuilder.actions(actions.let(IResolvable::unwrap))
      }

      override fun actions(actions: List<Any>) {
        cdkBuilder.actions(actions)
      }

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun recipients(recipients: List<String>) {
        cdkBuilder.recipients(recipients)
      }

      override fun scanEnabled(scanEnabled: Boolean) {
        cdkBuilder.scanEnabled(scanEnabled)
      }

      override fun scanEnabled(scanEnabled: IResolvable) {
        cdkBuilder.scanEnabled(scanEnabled.let(IResolvable::unwrap))
      }

      override fun tlsPolicy(tlsPolicy: String) {
        cdkBuilder.tlsPolicy(tlsPolicy)
      }

      public fun build(): software.amazon.awscdk.services.ses.CfnReceiptRule.RuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.ses.CfnReceiptRule.RuleProperty,
    ) : RuleProperty {
      override fun actions(): Any? = unwrap(this).getActions()

      override fun enabled(): Any? = unwrap(this).getEnabled()

      override fun name(): String? = unwrap(this).getName()

      override fun recipients(): List<String> = unwrap(this).getRecipients() ?: emptyList()

      override fun scanEnabled(): Any? = unwrap(this).getScanEnabled()

      override fun tlsPolicy(): String? = unwrap(this).getTlsPolicy()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnReceiptRule.RuleProperty):
          RuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleProperty):
          software.amazon.awscdk.services.ses.CfnReceiptRule.RuleProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SNSActionProperty {
    public fun encoding(): String? = unwrap(this).getEncoding()

    public fun topicArn(): String? = unwrap(this).getTopicArn()

    public interface Builder {
      public fun encoding(encoding: String)

      public fun topicArn(topicArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnReceiptRule.SNSActionProperty.Builder =
          software.amazon.awscdk.services.ses.CfnReceiptRule.SNSActionProperty.builder()

      override fun encoding(encoding: String) {
        cdkBuilder.encoding(encoding)
      }

      override fun topicArn(topicArn: String) {
        cdkBuilder.topicArn(topicArn)
      }

      public fun build(): software.amazon.awscdk.services.ses.CfnReceiptRule.SNSActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.ses.CfnReceiptRule.SNSActionProperty,
    ) : SNSActionProperty {
      override fun encoding(): String? = unwrap(this).getEncoding()

      override fun topicArn(): String? = unwrap(this).getTopicArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SNSActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnReceiptRule.SNSActionProperty):
          SNSActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SNSActionProperty):
          software.amazon.awscdk.services.ses.CfnReceiptRule.SNSActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface StopActionProperty {
    public fun scope(): String

    public fun topicArn(): String? = unwrap(this).getTopicArn()

    public interface Builder {
      public fun scope(scope: String)

      public fun topicArn(topicArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnReceiptRule.StopActionProperty.Builder =
          software.amazon.awscdk.services.ses.CfnReceiptRule.StopActionProperty.builder()

      override fun scope(scope: String) {
        cdkBuilder.scope(scope)
      }

      override fun topicArn(topicArn: String) {
        cdkBuilder.topicArn(topicArn)
      }

      public fun build(): software.amazon.awscdk.services.ses.CfnReceiptRule.StopActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.ses.CfnReceiptRule.StopActionProperty,
    ) : StopActionProperty {
      override fun scope(): String = unwrap(this).getScope()

      override fun topicArn(): String? = unwrap(this).getTopicArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): StopActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnReceiptRule.StopActionProperty):
          StopActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StopActionProperty):
          software.amazon.awscdk.services.ses.CfnReceiptRule.StopActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ActionProperty {
    public fun addHeaderAction(): Any? = unwrap(this).getAddHeaderAction()

    public fun bounceAction(): Any? = unwrap(this).getBounceAction()

    public fun lambdaAction(): Any? = unwrap(this).getLambdaAction()

    public fun s3Action(): Any? = unwrap(this).getS3Action()

    public fun snsAction(): Any? = unwrap(this).getSnsAction()

    public fun stopAction(): Any? = unwrap(this).getStopAction()

    public fun workmailAction(): Any? = unwrap(this).getWorkmailAction()

    public interface Builder {
      public fun addHeaderAction(addHeaderAction: IResolvable)

      public fun addHeaderAction(addHeaderAction: AddHeaderActionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9657342d5d725aa7477565fb4f7c62b6b32733c91f8ff2534f2413da365db9d9")
      public fun addHeaderAction(addHeaderAction: AddHeaderActionProperty.Builder.() -> Unit)

      public fun bounceAction(bounceAction: IResolvable)

      public fun bounceAction(bounceAction: BounceActionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("45943b0805b36445eee8feb6884a6b0e91f26389e796f71bca770b22ee55b580")
      public fun bounceAction(bounceAction: BounceActionProperty.Builder.() -> Unit)

      public fun lambdaAction(lambdaAction: IResolvable)

      public fun lambdaAction(lambdaAction: LambdaActionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5fa41d57bee605fca01822c760a8a9020105a2d44d39aeab7a79fa532090c8ff")
      public fun lambdaAction(lambdaAction: LambdaActionProperty.Builder.() -> Unit)

      public fun s3Action(s3Action: IResolvable)

      public fun s3Action(s3Action: S3ActionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac64193bd062afbc8f65aa49e24738f9181901ef3701cba3ad6be486fc8126a1")
      public fun s3Action(s3Action: S3ActionProperty.Builder.() -> Unit)

      public fun snsAction(snsAction: IResolvable)

      public fun snsAction(snsAction: SNSActionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3db4cb2bf27edbab1846c2a57b8d5375d014303e7a42a2b3f0faa2285c3c4320")
      public fun snsAction(snsAction: SNSActionProperty.Builder.() -> Unit)

      public fun stopAction(stopAction: IResolvable)

      public fun stopAction(stopAction: StopActionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("18fab212c7b1d1441244ab51c1bc3b8a8e1f85e7a9c4b2439f6847cc36b2f0de")
      public fun stopAction(stopAction: StopActionProperty.Builder.() -> Unit)

      public fun workmailAction(workmailAction: IResolvable)

      public fun workmailAction(workmailAction: WorkmailActionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2e6da27a29ffc59c66ab95ebaa1a29b810412f3740b2dbd633e4d4201903ad81")
      public fun workmailAction(workmailAction: WorkmailActionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnReceiptRule.ActionProperty.Builder =
          software.amazon.awscdk.services.ses.CfnReceiptRule.ActionProperty.builder()

      override fun addHeaderAction(addHeaderAction: IResolvable) {
        cdkBuilder.addHeaderAction(addHeaderAction.let(IResolvable::unwrap))
      }

      override fun addHeaderAction(addHeaderAction: AddHeaderActionProperty) {
        cdkBuilder.addHeaderAction(addHeaderAction.let(AddHeaderActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9657342d5d725aa7477565fb4f7c62b6b32733c91f8ff2534f2413da365db9d9")
      override fun addHeaderAction(addHeaderAction: AddHeaderActionProperty.Builder.() -> Unit):
          Unit = addHeaderAction(AddHeaderActionProperty(addHeaderAction))

      override fun bounceAction(bounceAction: IResolvable) {
        cdkBuilder.bounceAction(bounceAction.let(IResolvable::unwrap))
      }

      override fun bounceAction(bounceAction: BounceActionProperty) {
        cdkBuilder.bounceAction(bounceAction.let(BounceActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("45943b0805b36445eee8feb6884a6b0e91f26389e796f71bca770b22ee55b580")
      override fun bounceAction(bounceAction: BounceActionProperty.Builder.() -> Unit): Unit =
          bounceAction(BounceActionProperty(bounceAction))

      override fun lambdaAction(lambdaAction: IResolvable) {
        cdkBuilder.lambdaAction(lambdaAction.let(IResolvable::unwrap))
      }

      override fun lambdaAction(lambdaAction: LambdaActionProperty) {
        cdkBuilder.lambdaAction(lambdaAction.let(LambdaActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5fa41d57bee605fca01822c760a8a9020105a2d44d39aeab7a79fa532090c8ff")
      override fun lambdaAction(lambdaAction: LambdaActionProperty.Builder.() -> Unit): Unit =
          lambdaAction(LambdaActionProperty(lambdaAction))

      override fun s3Action(s3Action: IResolvable) {
        cdkBuilder.s3Action(s3Action.let(IResolvable::unwrap))
      }

      override fun s3Action(s3Action: S3ActionProperty) {
        cdkBuilder.s3Action(s3Action.let(S3ActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac64193bd062afbc8f65aa49e24738f9181901ef3701cba3ad6be486fc8126a1")
      override fun s3Action(s3Action: S3ActionProperty.Builder.() -> Unit): Unit =
          s3Action(S3ActionProperty(s3Action))

      override fun snsAction(snsAction: IResolvable) {
        cdkBuilder.snsAction(snsAction.let(IResolvable::unwrap))
      }

      override fun snsAction(snsAction: SNSActionProperty) {
        cdkBuilder.snsAction(snsAction.let(SNSActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3db4cb2bf27edbab1846c2a57b8d5375d014303e7a42a2b3f0faa2285c3c4320")
      override fun snsAction(snsAction: SNSActionProperty.Builder.() -> Unit): Unit =
          snsAction(SNSActionProperty(snsAction))

      override fun stopAction(stopAction: IResolvable) {
        cdkBuilder.stopAction(stopAction.let(IResolvable::unwrap))
      }

      override fun stopAction(stopAction: StopActionProperty) {
        cdkBuilder.stopAction(stopAction.let(StopActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("18fab212c7b1d1441244ab51c1bc3b8a8e1f85e7a9c4b2439f6847cc36b2f0de")
      override fun stopAction(stopAction: StopActionProperty.Builder.() -> Unit): Unit =
          stopAction(StopActionProperty(stopAction))

      override fun workmailAction(workmailAction: IResolvable) {
        cdkBuilder.workmailAction(workmailAction.let(IResolvable::unwrap))
      }

      override fun workmailAction(workmailAction: WorkmailActionProperty) {
        cdkBuilder.workmailAction(workmailAction.let(WorkmailActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2e6da27a29ffc59c66ab95ebaa1a29b810412f3740b2dbd633e4d4201903ad81")
      override fun workmailAction(workmailAction: WorkmailActionProperty.Builder.() -> Unit): Unit =
          workmailAction(WorkmailActionProperty(workmailAction))

      public fun build(): software.amazon.awscdk.services.ses.CfnReceiptRule.ActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.ses.CfnReceiptRule.ActionProperty,
    ) : ActionProperty {
      override fun addHeaderAction(): Any? = unwrap(this).getAddHeaderAction()

      override fun bounceAction(): Any? = unwrap(this).getBounceAction()

      override fun lambdaAction(): Any? = unwrap(this).getLambdaAction()

      override fun s3Action(): Any? = unwrap(this).getS3Action()

      override fun snsAction(): Any? = unwrap(this).getSnsAction()

      override fun stopAction(): Any? = unwrap(this).getStopAction()

      override fun workmailAction(): Any? = unwrap(this).getWorkmailAction()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnReceiptRule.ActionProperty):
          ActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionProperty):
          software.amazon.awscdk.services.ses.CfnReceiptRule.ActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
