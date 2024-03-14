package io.cloudshiftdev.awscdk.services.cognito

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

public open class CfnUserPoolRiskConfigurationAttachment internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment,
) : CfnResource(cdkObject), IInspectable {
  public open fun accountTakeoverRiskConfiguration(): Any? =
      unwrap(this).getAccountTakeoverRiskConfiguration()

  public open fun accountTakeoverRiskConfiguration(`value`: IResolvable) {
    unwrap(this).setAccountTakeoverRiskConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open
      fun accountTakeoverRiskConfiguration(`value`: AccountTakeoverRiskConfigurationTypeProperty) {
    unwrap(this).setAccountTakeoverRiskConfiguration(`value`.let(AccountTakeoverRiskConfigurationTypeProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a2d693232dc81f90060219d90f0f03de79d833bbb55b26aa0ac11a65de8002d6")
  public open
      fun accountTakeoverRiskConfiguration(`value`: AccountTakeoverRiskConfigurationTypeProperty.Builder.() -> Unit):
      Unit = accountTakeoverRiskConfiguration(AccountTakeoverRiskConfigurationTypeProperty(`value`))

  public open fun clientId(): String = unwrap(this).getClientId()

  public open fun clientId(`value`: String) {
    unwrap(this).setClientId(`value`)
  }

  public open fun compromisedCredentialsRiskConfiguration(): Any? =
      unwrap(this).getCompromisedCredentialsRiskConfiguration()

  public open fun compromisedCredentialsRiskConfiguration(`value`: IResolvable) {
    unwrap(this).setCompromisedCredentialsRiskConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open
      fun compromisedCredentialsRiskConfiguration(`value`: CompromisedCredentialsRiskConfigurationTypeProperty) {
    unwrap(this).setCompromisedCredentialsRiskConfiguration(`value`.let(CompromisedCredentialsRiskConfigurationTypeProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e29eeb48e5960f8d9dcf803c25650c686eb50039e88d6d55c7735e6f3c6cc394")
  public open
      fun compromisedCredentialsRiskConfiguration(`value`: CompromisedCredentialsRiskConfigurationTypeProperty.Builder.() -> Unit):
      Unit =
      compromisedCredentialsRiskConfiguration(CompromisedCredentialsRiskConfigurationTypeProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun riskExceptionConfiguration(): Any? = unwrap(this).getRiskExceptionConfiguration()

  public open fun riskExceptionConfiguration(`value`: IResolvable) {
    unwrap(this).setRiskExceptionConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun riskExceptionConfiguration(`value`: RiskExceptionConfigurationTypeProperty) {
    unwrap(this).setRiskExceptionConfiguration(`value`.let(RiskExceptionConfigurationTypeProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0ca2b19f1a4cca9563cf0441443606153b1460d769fb29c46a97b8e30b87f091")
  public open
      fun riskExceptionConfiguration(`value`: RiskExceptionConfigurationTypeProperty.Builder.() -> Unit):
      Unit = riskExceptionConfiguration(RiskExceptionConfigurationTypeProperty(`value`))

  public open fun userPoolId(): String = unwrap(this).getUserPoolId()

  public open fun userPoolId(`value`: String) {
    unwrap(this).setUserPoolId(`value`)
  }

  public interface Builder {
    public fun accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration: IResolvable) {
    }

    public
        fun accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration: AccountTakeoverRiskConfigurationTypeProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("721ca80ae4ed9e75bccc80f643c64dc5e542b0513fb094e43bea7d923222a6af")
    public
        fun accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration: AccountTakeoverRiskConfigurationTypeProperty.Builder.() -> Unit) {
    }

    public fun clientId(clientId: String) {
    }

    public
        fun compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration: IResolvable) {
    }

    public
        fun compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration: CompromisedCredentialsRiskConfigurationTypeProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d67967ce232d079c4e109c209c5a8c352c9d0c457a9de7ff64f55a6bbdf67b5d")
    public
        fun compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration: CompromisedCredentialsRiskConfigurationTypeProperty.Builder.() -> Unit) {
    }

    public fun riskExceptionConfiguration(riskExceptionConfiguration: IResolvable) {
    }

    public
        fun riskExceptionConfiguration(riskExceptionConfiguration: RiskExceptionConfigurationTypeProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18a81f7eda386fc8e080c1809ae323198c29d00eb41bfadf7af4b679c4a2e8d4")
    public
        fun riskExceptionConfiguration(riskExceptionConfiguration: RiskExceptionConfigurationTypeProperty.Builder.() -> Unit) {
    }

    public fun userPoolId(userPoolId: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.Builder =
        software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.Builder.create(scope,
        id)

    public override
        fun accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration: IResolvable) {
      cdkBuilder.accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration.let(IResolvable::unwrap))
    }

    public override
        fun accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration: AccountTakeoverRiskConfigurationTypeProperty) {
      cdkBuilder.accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration.let(AccountTakeoverRiskConfigurationTypeProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("721ca80ae4ed9e75bccc80f643c64dc5e542b0513fb094e43bea7d923222a6af")
    public override
        fun accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration: AccountTakeoverRiskConfigurationTypeProperty.Builder.() -> Unit):
        Unit =
        accountTakeoverRiskConfiguration(AccountTakeoverRiskConfigurationTypeProperty(accountTakeoverRiskConfiguration))

    public override fun clientId(clientId: String) {
      cdkBuilder.clientId(clientId)
    }

    public override
        fun compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration: IResolvable) {
      cdkBuilder.compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration.let(IResolvable::unwrap))
    }

    public override
        fun compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration: CompromisedCredentialsRiskConfigurationTypeProperty) {
      cdkBuilder.compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration.let(CompromisedCredentialsRiskConfigurationTypeProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d67967ce232d079c4e109c209c5a8c352c9d0c457a9de7ff64f55a6bbdf67b5d")
    public override
        fun compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration: CompromisedCredentialsRiskConfigurationTypeProperty.Builder.() -> Unit):
        Unit =
        compromisedCredentialsRiskConfiguration(CompromisedCredentialsRiskConfigurationTypeProperty(compromisedCredentialsRiskConfiguration))

    public override fun riskExceptionConfiguration(riskExceptionConfiguration: IResolvable) {
      cdkBuilder.riskExceptionConfiguration(riskExceptionConfiguration.let(IResolvable::unwrap))
    }

    public override
        fun riskExceptionConfiguration(riskExceptionConfiguration: RiskExceptionConfigurationTypeProperty) {
      cdkBuilder.riskExceptionConfiguration(riskExceptionConfiguration.let(RiskExceptionConfigurationTypeProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18a81f7eda386fc8e080c1809ae323198c29d00eb41bfadf7af4b679c4a2e8d4")
    public override
        fun riskExceptionConfiguration(riskExceptionConfiguration: RiskExceptionConfigurationTypeProperty.Builder.() -> Unit):
        Unit =
        riskExceptionConfiguration(RiskExceptionConfigurationTypeProperty(riskExceptionConfiguration))

    public override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

    public fun build():
        software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnUserPoolRiskConfigurationAttachment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnUserPoolRiskConfigurationAttachment(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment):
        CfnUserPoolRiskConfigurationAttachment = CfnUserPoolRiskConfigurationAttachment(cdkObject)

    internal fun unwrap(wrapped: CfnUserPoolRiskConfigurationAttachment):
        software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment =
        wrapped.cdkObject
  }

  public interface AccountTakeoverActionTypeProperty {
    public fun eventAction(): String

    public fun notify(): Any

    public interface Builder {
      public fun eventAction(eventAction: String) {
      }

      public fun notify(notify: Boolean) {
      }

      public fun notify(notify: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionTypeProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionTypeProperty.builder()

      public override fun eventAction(eventAction: String) {
        cdkBuilder.eventAction(eventAction)
      }

      public override fun notify(notify: Boolean) {
        cdkBuilder.notify(notify)
      }

      public override fun notify(notify: IResolvable) {
        cdkBuilder.notify(notify.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionTypeProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionTypeProperty,
    ) : AccountTakeoverActionTypeProperty {
      public override fun eventAction(): String = unwrap(this).getEventAction()

      public override fun notify(): Any = unwrap(this).getNotify()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AccountTakeoverActionTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionTypeProperty):
          AccountTakeoverActionTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccountTakeoverActionTypeProperty):
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionTypeProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface NotifyEmailTypeProperty {
    public fun htmlBody(): String? = unwrap(this).getHtmlBody()

    public fun subject(): String

    public fun textBody(): String? = unwrap(this).getTextBody()

    public interface Builder {
      public fun htmlBody(htmlBody: String) {
      }

      public fun subject(subject: String) {
      }

      public fun textBody(textBody: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.NotifyEmailTypeProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.NotifyEmailTypeProperty.builder()

      public override fun htmlBody(htmlBody: String) {
        cdkBuilder.htmlBody(htmlBody)
      }

      public override fun subject(subject: String) {
        cdkBuilder.subject(subject)
      }

      public override fun textBody(textBody: String) {
        cdkBuilder.textBody(textBody)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.NotifyEmailTypeProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.NotifyEmailTypeProperty,
    ) : NotifyEmailTypeProperty {
      public override fun htmlBody(): String? = unwrap(this).getHtmlBody()

      public override fun subject(): String = unwrap(this).getSubject()

      public override fun textBody(): String? = unwrap(this).getTextBody()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NotifyEmailTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.NotifyEmailTypeProperty):
          NotifyEmailTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NotifyEmailTypeProperty):
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.NotifyEmailTypeProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface CompromisedCredentialsActionsTypeProperty {
    public fun eventAction(): String

    public interface Builder {
      public fun eventAction(eventAction: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsActionsTypeProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsActionsTypeProperty.builder()

      public override fun eventAction(eventAction: String) {
        cdkBuilder.eventAction(eventAction)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsActionsTypeProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsActionsTypeProperty,
    ) : CompromisedCredentialsActionsTypeProperty {
      public override fun eventAction(): String = unwrap(this).getEventAction()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          CompromisedCredentialsActionsTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsActionsTypeProperty):
          CompromisedCredentialsActionsTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CompromisedCredentialsActionsTypeProperty):
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsActionsTypeProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AccountTakeoverRiskConfigurationTypeProperty {
    public fun actions(): Any

    public fun notifyConfiguration(): Any? = unwrap(this).getNotifyConfiguration()

    public interface Builder {
      public fun actions(actions: IResolvable) {
      }

      public fun actions(actions: AccountTakeoverActionsTypeProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f2c0e56172104dcc61cc0a874470d33913d309d539be3f24d6c0325b8d990990")
      public fun actions(actions: AccountTakeoverActionsTypeProperty.Builder.() -> Unit) {
      }

      public fun notifyConfiguration(notifyConfiguration: IResolvable) {
      }

      public fun notifyConfiguration(notifyConfiguration: NotifyConfigurationTypeProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("92517bde806b2d8246e6e681dd7ac5e32a2ea81f8ffd5c47a0953c0292176731")
      public
          fun notifyConfiguration(notifyConfiguration: NotifyConfigurationTypeProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverRiskConfigurationTypeProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverRiskConfigurationTypeProperty.builder()

      public override fun actions(actions: IResolvable) {
        cdkBuilder.actions(actions.let(IResolvable::unwrap))
      }

      public override fun actions(actions: AccountTakeoverActionsTypeProperty) {
        cdkBuilder.actions(actions.let(AccountTakeoverActionsTypeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f2c0e56172104dcc61cc0a874470d33913d309d539be3f24d6c0325b8d990990")
      public override fun actions(actions: AccountTakeoverActionsTypeProperty.Builder.() -> Unit):
          Unit = actions(AccountTakeoverActionsTypeProperty(actions))

      public override fun notifyConfiguration(notifyConfiguration: IResolvable) {
        cdkBuilder.notifyConfiguration(notifyConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun notifyConfiguration(notifyConfiguration: NotifyConfigurationTypeProperty) {
        cdkBuilder.notifyConfiguration(notifyConfiguration.let(NotifyConfigurationTypeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("92517bde806b2d8246e6e681dd7ac5e32a2ea81f8ffd5c47a0953c0292176731")
      public override
          fun notifyConfiguration(notifyConfiguration: NotifyConfigurationTypeProperty.Builder.() -> Unit):
          Unit = notifyConfiguration(NotifyConfigurationTypeProperty(notifyConfiguration))

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverRiskConfigurationTypeProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverRiskConfigurationTypeProperty,
    ) : AccountTakeoverRiskConfigurationTypeProperty {
      public override fun actions(): Any = unwrap(this).getActions()

      public override fun notifyConfiguration(): Any? = unwrap(this).getNotifyConfiguration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AccountTakeoverRiskConfigurationTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverRiskConfigurationTypeProperty):
          AccountTakeoverRiskConfigurationTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccountTakeoverRiskConfigurationTypeProperty):
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverRiskConfigurationTypeProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface NotifyConfigurationTypeProperty {
    public fun blockEmail(): Any? = unwrap(this).getBlockEmail()

    public fun from(): String? = unwrap(this).getFrom()

    public fun mfaEmail(): Any? = unwrap(this).getMfaEmail()

    public fun noActionEmail(): Any? = unwrap(this).getNoActionEmail()

    public fun replyTo(): String? = unwrap(this).getReplyTo()

    public fun sourceArn(): String

    public interface Builder {
      public fun blockEmail(blockEmail: IResolvable) {
      }

      public fun blockEmail(blockEmail: NotifyEmailTypeProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4592ec4e009cfcb72b485c09a8e6e115c59fdca2e25084a6a4300e2859aa44e5")
      public fun blockEmail(blockEmail: NotifyEmailTypeProperty.Builder.() -> Unit) {
      }

      public fun from(from: String) {
      }

      public fun mfaEmail(mfaEmail: IResolvable) {
      }

      public fun mfaEmail(mfaEmail: NotifyEmailTypeProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ade55e72377cf33f6e0e8e3991da6d3d475dd44052b9b6c5e9a228ceb708c058")
      public fun mfaEmail(mfaEmail: NotifyEmailTypeProperty.Builder.() -> Unit) {
      }

      public fun noActionEmail(noActionEmail: IResolvable) {
      }

      public fun noActionEmail(noActionEmail: NotifyEmailTypeProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7e2f3d6291590c7dfd8efc873f1d0aa953980e8e9719ea7f682e29a72c97a7cb")
      public fun noActionEmail(noActionEmail: NotifyEmailTypeProperty.Builder.() -> Unit) {
      }

      public fun replyTo(replyTo: String) {
      }

      public fun sourceArn(sourceArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.NotifyConfigurationTypeProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.NotifyConfigurationTypeProperty.builder()

      public override fun blockEmail(blockEmail: IResolvable) {
        cdkBuilder.blockEmail(blockEmail.let(IResolvable::unwrap))
      }

      public override fun blockEmail(blockEmail: NotifyEmailTypeProperty) {
        cdkBuilder.blockEmail(blockEmail.let(NotifyEmailTypeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4592ec4e009cfcb72b485c09a8e6e115c59fdca2e25084a6a4300e2859aa44e5")
      public override fun blockEmail(blockEmail: NotifyEmailTypeProperty.Builder.() -> Unit): Unit =
          blockEmail(NotifyEmailTypeProperty(blockEmail))

      public override fun from(from: String) {
        cdkBuilder.from(from)
      }

      public override fun mfaEmail(mfaEmail: IResolvable) {
        cdkBuilder.mfaEmail(mfaEmail.let(IResolvable::unwrap))
      }

      public override fun mfaEmail(mfaEmail: NotifyEmailTypeProperty) {
        cdkBuilder.mfaEmail(mfaEmail.let(NotifyEmailTypeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ade55e72377cf33f6e0e8e3991da6d3d475dd44052b9b6c5e9a228ceb708c058")
      public override fun mfaEmail(mfaEmail: NotifyEmailTypeProperty.Builder.() -> Unit): Unit =
          mfaEmail(NotifyEmailTypeProperty(mfaEmail))

      public override fun noActionEmail(noActionEmail: IResolvable) {
        cdkBuilder.noActionEmail(noActionEmail.let(IResolvable::unwrap))
      }

      public override fun noActionEmail(noActionEmail: NotifyEmailTypeProperty) {
        cdkBuilder.noActionEmail(noActionEmail.let(NotifyEmailTypeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7e2f3d6291590c7dfd8efc873f1d0aa953980e8e9719ea7f682e29a72c97a7cb")
      public override fun noActionEmail(noActionEmail: NotifyEmailTypeProperty.Builder.() -> Unit):
          Unit = noActionEmail(NotifyEmailTypeProperty(noActionEmail))

      public override fun replyTo(replyTo: String) {
        cdkBuilder.replyTo(replyTo)
      }

      public override fun sourceArn(sourceArn: String) {
        cdkBuilder.sourceArn(sourceArn)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.NotifyConfigurationTypeProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.NotifyConfigurationTypeProperty,
    ) : NotifyConfigurationTypeProperty {
      public override fun blockEmail(): Any? = unwrap(this).getBlockEmail()

      public override fun from(): String? = unwrap(this).getFrom()

      public override fun mfaEmail(): Any? = unwrap(this).getMfaEmail()

      public override fun noActionEmail(): Any? = unwrap(this).getNoActionEmail()

      public override fun replyTo(): String? = unwrap(this).getReplyTo()

      public override fun sourceArn(): String = unwrap(this).getSourceArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NotifyConfigurationTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.NotifyConfigurationTypeProperty):
          NotifyConfigurationTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NotifyConfigurationTypeProperty):
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.NotifyConfigurationTypeProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AccountTakeoverActionsTypeProperty {
    public fun highAction(): Any? = unwrap(this).getHighAction()

    public fun lowAction(): Any? = unwrap(this).getLowAction()

    public fun mediumAction(): Any? = unwrap(this).getMediumAction()

    public interface Builder {
      public fun highAction(highAction: IResolvable) {
      }

      public fun highAction(highAction: AccountTakeoverActionTypeProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("70360ca930418d113c3f4f29d74bc50c78c8d0a8793e26af75eb1c32ddf009d2")
      public fun highAction(highAction: AccountTakeoverActionTypeProperty.Builder.() -> Unit) {
      }

      public fun lowAction(lowAction: IResolvable) {
      }

      public fun lowAction(lowAction: AccountTakeoverActionTypeProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb015d149cc8017ed15bddd8e6ff46fc0e53195f831d12fc31fe005305b98829")
      public fun lowAction(lowAction: AccountTakeoverActionTypeProperty.Builder.() -> Unit) {
      }

      public fun mediumAction(mediumAction: IResolvable) {
      }

      public fun mediumAction(mediumAction: AccountTakeoverActionTypeProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d0be028fa84e1ccf8a6615b4fb0fa99924be459f987b9f079eaf28bcdf633f50")
      public fun mediumAction(mediumAction: AccountTakeoverActionTypeProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionsTypeProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionsTypeProperty.builder()

      public override fun highAction(highAction: IResolvable) {
        cdkBuilder.highAction(highAction.let(IResolvable::unwrap))
      }

      public override fun highAction(highAction: AccountTakeoverActionTypeProperty) {
        cdkBuilder.highAction(highAction.let(AccountTakeoverActionTypeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("70360ca930418d113c3f4f29d74bc50c78c8d0a8793e26af75eb1c32ddf009d2")
      public override
          fun highAction(highAction: AccountTakeoverActionTypeProperty.Builder.() -> Unit): Unit =
          highAction(AccountTakeoverActionTypeProperty(highAction))

      public override fun lowAction(lowAction: IResolvable) {
        cdkBuilder.lowAction(lowAction.let(IResolvable::unwrap))
      }

      public override fun lowAction(lowAction: AccountTakeoverActionTypeProperty) {
        cdkBuilder.lowAction(lowAction.let(AccountTakeoverActionTypeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb015d149cc8017ed15bddd8e6ff46fc0e53195f831d12fc31fe005305b98829")
      public override
          fun lowAction(lowAction: AccountTakeoverActionTypeProperty.Builder.() -> Unit): Unit =
          lowAction(AccountTakeoverActionTypeProperty(lowAction))

      public override fun mediumAction(mediumAction: IResolvable) {
        cdkBuilder.mediumAction(mediumAction.let(IResolvable::unwrap))
      }

      public override fun mediumAction(mediumAction: AccountTakeoverActionTypeProperty) {
        cdkBuilder.mediumAction(mediumAction.let(AccountTakeoverActionTypeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d0be028fa84e1ccf8a6615b4fb0fa99924be459f987b9f079eaf28bcdf633f50")
      public override
          fun mediumAction(mediumAction: AccountTakeoverActionTypeProperty.Builder.() -> Unit): Unit
          = mediumAction(AccountTakeoverActionTypeProperty(mediumAction))

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionsTypeProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionsTypeProperty,
    ) : AccountTakeoverActionsTypeProperty {
      public override fun highAction(): Any? = unwrap(this).getHighAction()

      public override fun lowAction(): Any? = unwrap(this).getLowAction()

      public override fun mediumAction(): Any? = unwrap(this).getMediumAction()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AccountTakeoverActionsTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionsTypeProperty):
          AccountTakeoverActionsTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccountTakeoverActionsTypeProperty):
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionsTypeProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface RiskExceptionConfigurationTypeProperty {
    public fun blockedIpRangeList(): List<String> = unwrap(this).getBlockedIpRangeList() ?:
        emptyList()

    public fun skippedIpRangeList(): List<String> = unwrap(this).getSkippedIpRangeList() ?:
        emptyList()

    public interface Builder {
      public fun blockedIpRangeList(blockedIpRangeList: List<String>) {
      }

      public fun skippedIpRangeList(skippedIpRangeList: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty.builder()

      public override fun blockedIpRangeList(blockedIpRangeList: List<String>) {
        cdkBuilder.blockedIpRangeList(blockedIpRangeList)
      }

      public override fun skippedIpRangeList(skippedIpRangeList: List<String>) {
        cdkBuilder.skippedIpRangeList(skippedIpRangeList)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty,
    ) : RiskExceptionConfigurationTypeProperty {
      public override fun blockedIpRangeList(): List<String> = unwrap(this).getBlockedIpRangeList()
          ?: emptyList()

      public override fun skippedIpRangeList(): List<String> = unwrap(this).getSkippedIpRangeList()
          ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          RiskExceptionConfigurationTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty):
          RiskExceptionConfigurationTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RiskExceptionConfigurationTypeProperty):
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface CompromisedCredentialsRiskConfigurationTypeProperty {
    public fun actions(): Any

    public fun eventFilter(): List<String> = unwrap(this).getEventFilter() ?: emptyList()

    public interface Builder {
      public fun actions(actions: IResolvable) {
      }

      public fun actions(actions: CompromisedCredentialsActionsTypeProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("10d7c10c415afdc9e4c831e0df67d2a60d7475d6b543b486081c0c73b3fce0e7")
      public fun actions(actions: CompromisedCredentialsActionsTypeProperty.Builder.() -> Unit) {
      }

      public fun eventFilter(eventFilter: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty.builder()

      public override fun actions(actions: IResolvable) {
        cdkBuilder.actions(actions.let(IResolvable::unwrap))
      }

      public override fun actions(actions: CompromisedCredentialsActionsTypeProperty) {
        cdkBuilder.actions(actions.let(CompromisedCredentialsActionsTypeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("10d7c10c415afdc9e4c831e0df67d2a60d7475d6b543b486081c0c73b3fce0e7")
      public override
          fun actions(actions: CompromisedCredentialsActionsTypeProperty.Builder.() -> Unit): Unit =
          actions(CompromisedCredentialsActionsTypeProperty(actions))

      public override fun eventFilter(eventFilter: List<String>) {
        cdkBuilder.eventFilter(eventFilter)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty,
    ) : CompromisedCredentialsRiskConfigurationTypeProperty {
      public override fun actions(): Any = unwrap(this).getActions()

      public override fun eventFilter(): List<String> = unwrap(this).getEventFilter() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          CompromisedCredentialsRiskConfigurationTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty):
          CompromisedCredentialsRiskConfigurationTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CompromisedCredentialsRiskConfigurationTypeProperty):
          software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
