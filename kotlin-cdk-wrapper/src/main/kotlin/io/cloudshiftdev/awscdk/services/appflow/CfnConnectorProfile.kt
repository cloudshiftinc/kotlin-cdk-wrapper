@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appflow

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnConnectorProfile internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrConnectorProfileArn(): String = unwrap(this).getAttrConnectorProfileArn()

  public open fun attrCredentialsArn(): String = unwrap(this).getAttrCredentialsArn()

  public open fun connectionMode(): String = unwrap(this).getConnectionMode()

  public open fun connectionMode(`value`: String) {
    unwrap(this).setConnectionMode(`value`)
  }

  public open fun connectorLabel(): String? = unwrap(this).getConnectorLabel()

  public open fun connectorLabel(`value`: String) {
    unwrap(this).setConnectorLabel(`value`)
  }

  public open fun connectorProfileConfig(): Any? = unwrap(this).getConnectorProfileConfig()

  public open fun connectorProfileConfig(`value`: IResolvable) {
    unwrap(this).setConnectorProfileConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun connectorProfileConfig(`value`: ConnectorProfileConfigProperty) {
    unwrap(this).setConnectorProfileConfig(`value`.let(ConnectorProfileConfigProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f1e1d92d37f697e4f9c19ccd5a89423faafa23a3bdf862d0f41897a2e157f954")
  public open
      fun connectorProfileConfig(`value`: ConnectorProfileConfigProperty.Builder.() -> Unit): Unit =
      connectorProfileConfig(ConnectorProfileConfigProperty(`value`))

  public open fun connectorProfileName(): String = unwrap(this).getConnectorProfileName()

  public open fun connectorProfileName(`value`: String) {
    unwrap(this).setConnectorProfileName(`value`)
  }

  public open fun connectorType(): String = unwrap(this).getConnectorType()

  public open fun connectorType(`value`: String) {
    unwrap(this).setConnectorType(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kmsArn(): String? = unwrap(this).getKmsArn()

  public open fun kmsArn(`value`: String) {
    unwrap(this).setKmsArn(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun connectionMode(connectionMode: String)

    public fun connectorLabel(connectorLabel: String)

    public fun connectorProfileConfig(connectorProfileConfig: IResolvable)

    public fun connectorProfileConfig(connectorProfileConfig: ConnectorProfileConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("896dbebf0606f5983d44893199ec825db9e0300487c20c43d14b8864588a81c7")
    public
        fun connectorProfileConfig(connectorProfileConfig: ConnectorProfileConfigProperty.Builder.() -> Unit)

    public fun connectorProfileName(connectorProfileName: String)

    public fun connectorType(connectorType: String)

    public fun kmsArn(kmsArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appflow.CfnConnectorProfile.Builder =
        software.amazon.awscdk.services.appflow.CfnConnectorProfile.Builder.create(scope, id)

    override fun connectionMode(connectionMode: String) {
      cdkBuilder.connectionMode(connectionMode)
    }

    override fun connectorLabel(connectorLabel: String) {
      cdkBuilder.connectorLabel(connectorLabel)
    }

    override fun connectorProfileConfig(connectorProfileConfig: IResolvable) {
      cdkBuilder.connectorProfileConfig(connectorProfileConfig.let(IResolvable::unwrap))
    }

    override fun connectorProfileConfig(connectorProfileConfig: ConnectorProfileConfigProperty) {
      cdkBuilder.connectorProfileConfig(connectorProfileConfig.let(ConnectorProfileConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("896dbebf0606f5983d44893199ec825db9e0300487c20c43d14b8864588a81c7")
    override
        fun connectorProfileConfig(connectorProfileConfig: ConnectorProfileConfigProperty.Builder.() -> Unit):
        Unit = connectorProfileConfig(ConnectorProfileConfigProperty(connectorProfileConfig))

    override fun connectorProfileName(connectorProfileName: String) {
      cdkBuilder.connectorProfileName(connectorProfileName)
    }

    override fun connectorType(connectorType: String) {
      cdkBuilder.connectorType(connectorType)
    }

    override fun kmsArn(kmsArn: String) {
      cdkBuilder.kmsArn(kmsArn)
    }

    public fun build(): software.amazon.awscdk.services.appflow.CfnConnectorProfile =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.appflow.CfnConnectorProfile.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConnectorProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConnectorProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile):
        CfnConnectorProfile = CfnConnectorProfile(cdkObject)

    internal fun unwrap(wrapped: CfnConnectorProfile):
        software.amazon.awscdk.services.appflow.CfnConnectorProfile = wrapped.cdkObject
  }

  public interface MarketoConnectorProfilePropertiesProperty {
    public fun instanceUrl(): String

    @CdkDslMarker
    public interface Builder {
      public fun instanceUrl(instanceUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.MarketoConnectorProfilePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.MarketoConnectorProfilePropertiesProperty.builder()

      override fun instanceUrl(instanceUrl: String) {
        cdkBuilder.instanceUrl(instanceUrl)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.MarketoConnectorProfilePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.MarketoConnectorProfilePropertiesProperty,
    ) : CdkObject(cdkObject), MarketoConnectorProfilePropertiesProperty {
      override fun instanceUrl(): String = unwrap(this).getInstanceUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MarketoConnectorProfilePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.MarketoConnectorProfilePropertiesProperty):
          MarketoConnectorProfilePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MarketoConnectorProfilePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.MarketoConnectorProfilePropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.MarketoConnectorProfilePropertiesProperty
    }
  }

  public interface ConnectorProfileCredentialsProperty {
    public fun amplitude(): Any? = unwrap(this).getAmplitude()

    public fun customConnector(): Any? = unwrap(this).getCustomConnector()

    public fun datadog(): Any? = unwrap(this).getDatadog()

    public fun dynatrace(): Any? = unwrap(this).getDynatrace()

    public fun googleAnalytics(): Any? = unwrap(this).getGoogleAnalytics()

    public fun inforNexus(): Any? = unwrap(this).getInforNexus()

    public fun marketo(): Any? = unwrap(this).getMarketo()

    public fun pardot(): Any? = unwrap(this).getPardot()

    public fun redshift(): Any? = unwrap(this).getRedshift()

    public fun salesforce(): Any? = unwrap(this).getSalesforce()

    public fun sapoData(): Any? = unwrap(this).getSapoData()

    public fun serviceNow(): Any? = unwrap(this).getServiceNow()

    public fun singular(): Any? = unwrap(this).getSingular()

    public fun slack(): Any? = unwrap(this).getSlack()

    public fun snowflake(): Any? = unwrap(this).getSnowflake()

    public fun trendmicro(): Any? = unwrap(this).getTrendmicro()

    public fun veeva(): Any? = unwrap(this).getVeeva()

    public fun zendesk(): Any? = unwrap(this).getZendesk()

    @CdkDslMarker
    public interface Builder {
      public fun amplitude(amplitude: IResolvable)

      public fun amplitude(amplitude: AmplitudeConnectorProfileCredentialsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a13f3a6b92c3140a2c2fe844178b159a8f6c9ce1d4a6e33c92219233fa83b518")
      public
          fun amplitude(amplitude: AmplitudeConnectorProfileCredentialsProperty.Builder.() -> Unit)

      public fun customConnector(customConnector: IResolvable)

      public fun customConnector(customConnector: CustomConnectorProfileCredentialsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("de0ec9a1a2110ec01eafab27e2ba55679dd59904dfa0a5d6856ed80f2a07b6d6")
      public
          fun customConnector(customConnector: CustomConnectorProfileCredentialsProperty.Builder.() -> Unit)

      public fun datadog(datadog: IResolvable)

      public fun datadog(datadog: DatadogConnectorProfileCredentialsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5b81882db9311849adfac68497a8ab987817c80dba2ac5eb58eaa565b9666547")
      public fun datadog(datadog: DatadogConnectorProfileCredentialsProperty.Builder.() -> Unit)

      public fun dynatrace(dynatrace: IResolvable)

      public fun dynatrace(dynatrace: DynatraceConnectorProfileCredentialsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("76a744f75a48180cf95e434c5966e699291eecaa8ace81adf30603721b1853d0")
      public
          fun dynatrace(dynatrace: DynatraceConnectorProfileCredentialsProperty.Builder.() -> Unit)

      public fun googleAnalytics(googleAnalytics: IResolvable)

      public
          fun googleAnalytics(googleAnalytics: GoogleAnalyticsConnectorProfileCredentialsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb30e74d46c198db42bf392ba83b60f71c4b33d2e41625918bebf390c571c507")
      public
          fun googleAnalytics(googleAnalytics: GoogleAnalyticsConnectorProfileCredentialsProperty.Builder.() -> Unit)

      public fun inforNexus(inforNexus: IResolvable)

      public fun inforNexus(inforNexus: InforNexusConnectorProfileCredentialsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8acbe30d4da577abfa3193ab8a767edd13ec6ca3478ecf140ff83c3285c438c0")
      public
          fun inforNexus(inforNexus: InforNexusConnectorProfileCredentialsProperty.Builder.() -> Unit)

      public fun marketo(marketo: IResolvable)

      public fun marketo(marketo: MarketoConnectorProfileCredentialsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("af93a2d55331477318e73fbfe419cd99ef86085447734542841ad9ea8a6c4c98")
      public fun marketo(marketo: MarketoConnectorProfileCredentialsProperty.Builder.() -> Unit)

      public fun pardot(pardot: IResolvable)

      public fun pardot(pardot: PardotConnectorProfileCredentialsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8c831f31c91ed683a67abeafbf5a5743266097be49831a41f426f4ed1e01c4d9")
      public fun pardot(pardot: PardotConnectorProfileCredentialsProperty.Builder.() -> Unit)

      public fun redshift(redshift: IResolvable)

      public fun redshift(redshift: RedshiftConnectorProfileCredentialsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("af49186e8f9f01e2ee0b591799b253cabf5f87c28b08b0d129443942e9fc2300")
      public fun redshift(redshift: RedshiftConnectorProfileCredentialsProperty.Builder.() -> Unit)

      public fun salesforce(salesforce: IResolvable)

      public fun salesforce(salesforce: SalesforceConnectorProfileCredentialsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8125096d4230ebacb552ce3d9537159b8a68b9464d2450bd5aa6f1facbe95b0e")
      public
          fun salesforce(salesforce: SalesforceConnectorProfileCredentialsProperty.Builder.() -> Unit)

      public fun sapoData(sapoData: IResolvable)

      public fun sapoData(sapoData: SAPODataConnectorProfileCredentialsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4eb8222a1406f59b6fa58b7a02bf8901be05d665f914ad45d45ac5fd045f4f4c")
      public fun sapoData(sapoData: SAPODataConnectorProfileCredentialsProperty.Builder.() -> Unit)

      public fun serviceNow(serviceNow: IResolvable)

      public fun serviceNow(serviceNow: ServiceNowConnectorProfileCredentialsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b02952e6f6b2fe2b5336744ecbc9f91b211bac85d0f16e3b1f03a113823df128")
      public
          fun serviceNow(serviceNow: ServiceNowConnectorProfileCredentialsProperty.Builder.() -> Unit)

      public fun singular(singular: IResolvable)

      public fun singular(singular: SingularConnectorProfileCredentialsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("10de7c54878920efd72a7492da089d5a5b5215db09a83d79d585211a7b854585")
      public fun singular(singular: SingularConnectorProfileCredentialsProperty.Builder.() -> Unit)

      public fun slack(slack: IResolvable)

      public fun slack(slack: SlackConnectorProfileCredentialsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e708360ff956de5ae66e5bcf479a906c70976420e0fdf09de88597ae609bcdfe")
      public fun slack(slack: SlackConnectorProfileCredentialsProperty.Builder.() -> Unit)

      public fun snowflake(snowflake: IResolvable)

      public fun snowflake(snowflake: SnowflakeConnectorProfileCredentialsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e7966e621aa0ec164496005a82ac4e96ad8951af5b97b6b1de9a0ee9f1fe01c6")
      public
          fun snowflake(snowflake: SnowflakeConnectorProfileCredentialsProperty.Builder.() -> Unit)

      public fun trendmicro(trendmicro: IResolvable)

      public fun trendmicro(trendmicro: TrendmicroConnectorProfileCredentialsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d9e50fa6e8affa334e551d0eeb002d38e8cd5ccdd5816cd285234e481ccab15a")
      public
          fun trendmicro(trendmicro: TrendmicroConnectorProfileCredentialsProperty.Builder.() -> Unit)

      public fun veeva(veeva: IResolvable)

      public fun veeva(veeva: VeevaConnectorProfileCredentialsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9003ee28121c39c203be2c1846faf43651b82652c7c1232e5aaffd48f12ad32b")
      public fun veeva(veeva: VeevaConnectorProfileCredentialsProperty.Builder.() -> Unit)

      public fun zendesk(zendesk: IResolvable)

      public fun zendesk(zendesk: ZendeskConnectorProfileCredentialsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c85e7ef3b51b61014438db51cceae114f0fd4b3e187906252b9a9db8d5fd1406")
      public fun zendesk(zendesk: ZendeskConnectorProfileCredentialsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfileCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfileCredentialsProperty.builder()

      override fun amplitude(amplitude: IResolvable) {
        cdkBuilder.amplitude(amplitude.let(IResolvable::unwrap))
      }

      override fun amplitude(amplitude: AmplitudeConnectorProfileCredentialsProperty) {
        cdkBuilder.amplitude(amplitude.let(AmplitudeConnectorProfileCredentialsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a13f3a6b92c3140a2c2fe844178b159a8f6c9ce1d4a6e33c92219233fa83b518")
      override
          fun amplitude(amplitude: AmplitudeConnectorProfileCredentialsProperty.Builder.() -> Unit):
          Unit = amplitude(AmplitudeConnectorProfileCredentialsProperty(amplitude))

      override fun customConnector(customConnector: IResolvable) {
        cdkBuilder.customConnector(customConnector.let(IResolvable::unwrap))
      }

      override fun customConnector(customConnector: CustomConnectorProfileCredentialsProperty) {
        cdkBuilder.customConnector(customConnector.let(CustomConnectorProfileCredentialsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("de0ec9a1a2110ec01eafab27e2ba55679dd59904dfa0a5d6856ed80f2a07b6d6")
      override
          fun customConnector(customConnector: CustomConnectorProfileCredentialsProperty.Builder.() -> Unit):
          Unit = customConnector(CustomConnectorProfileCredentialsProperty(customConnector))

      override fun datadog(datadog: IResolvable) {
        cdkBuilder.datadog(datadog.let(IResolvable::unwrap))
      }

      override fun datadog(datadog: DatadogConnectorProfileCredentialsProperty) {
        cdkBuilder.datadog(datadog.let(DatadogConnectorProfileCredentialsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5b81882db9311849adfac68497a8ab987817c80dba2ac5eb58eaa565b9666547")
      override fun datadog(datadog: DatadogConnectorProfileCredentialsProperty.Builder.() -> Unit):
          Unit = datadog(DatadogConnectorProfileCredentialsProperty(datadog))

      override fun dynatrace(dynatrace: IResolvable) {
        cdkBuilder.dynatrace(dynatrace.let(IResolvable::unwrap))
      }

      override fun dynatrace(dynatrace: DynatraceConnectorProfileCredentialsProperty) {
        cdkBuilder.dynatrace(dynatrace.let(DynatraceConnectorProfileCredentialsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("76a744f75a48180cf95e434c5966e699291eecaa8ace81adf30603721b1853d0")
      override
          fun dynatrace(dynatrace: DynatraceConnectorProfileCredentialsProperty.Builder.() -> Unit):
          Unit = dynatrace(DynatraceConnectorProfileCredentialsProperty(dynatrace))

      override fun googleAnalytics(googleAnalytics: IResolvable) {
        cdkBuilder.googleAnalytics(googleAnalytics.let(IResolvable::unwrap))
      }

      override
          fun googleAnalytics(googleAnalytics: GoogleAnalyticsConnectorProfileCredentialsProperty) {
        cdkBuilder.googleAnalytics(googleAnalytics.let(GoogleAnalyticsConnectorProfileCredentialsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb30e74d46c198db42bf392ba83b60f71c4b33d2e41625918bebf390c571c507")
      override
          fun googleAnalytics(googleAnalytics: GoogleAnalyticsConnectorProfileCredentialsProperty.Builder.() -> Unit):
          Unit =
          googleAnalytics(GoogleAnalyticsConnectorProfileCredentialsProperty(googleAnalytics))

      override fun inforNexus(inforNexus: IResolvable) {
        cdkBuilder.inforNexus(inforNexus.let(IResolvable::unwrap))
      }

      override fun inforNexus(inforNexus: InforNexusConnectorProfileCredentialsProperty) {
        cdkBuilder.inforNexus(inforNexus.let(InforNexusConnectorProfileCredentialsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8acbe30d4da577abfa3193ab8a767edd13ec6ca3478ecf140ff83c3285c438c0")
      override
          fun inforNexus(inforNexus: InforNexusConnectorProfileCredentialsProperty.Builder.() -> Unit):
          Unit = inforNexus(InforNexusConnectorProfileCredentialsProperty(inforNexus))

      override fun marketo(marketo: IResolvable) {
        cdkBuilder.marketo(marketo.let(IResolvable::unwrap))
      }

      override fun marketo(marketo: MarketoConnectorProfileCredentialsProperty) {
        cdkBuilder.marketo(marketo.let(MarketoConnectorProfileCredentialsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("af93a2d55331477318e73fbfe419cd99ef86085447734542841ad9ea8a6c4c98")
      override fun marketo(marketo: MarketoConnectorProfileCredentialsProperty.Builder.() -> Unit):
          Unit = marketo(MarketoConnectorProfileCredentialsProperty(marketo))

      override fun pardot(pardot: IResolvable) {
        cdkBuilder.pardot(pardot.let(IResolvable::unwrap))
      }

      override fun pardot(pardot: PardotConnectorProfileCredentialsProperty) {
        cdkBuilder.pardot(pardot.let(PardotConnectorProfileCredentialsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8c831f31c91ed683a67abeafbf5a5743266097be49831a41f426f4ed1e01c4d9")
      override fun pardot(pardot: PardotConnectorProfileCredentialsProperty.Builder.() -> Unit):
          Unit = pardot(PardotConnectorProfileCredentialsProperty(pardot))

      override fun redshift(redshift: IResolvable) {
        cdkBuilder.redshift(redshift.let(IResolvable::unwrap))
      }

      override fun redshift(redshift: RedshiftConnectorProfileCredentialsProperty) {
        cdkBuilder.redshift(redshift.let(RedshiftConnectorProfileCredentialsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("af49186e8f9f01e2ee0b591799b253cabf5f87c28b08b0d129443942e9fc2300")
      override
          fun redshift(redshift: RedshiftConnectorProfileCredentialsProperty.Builder.() -> Unit):
          Unit = redshift(RedshiftConnectorProfileCredentialsProperty(redshift))

      override fun salesforce(salesforce: IResolvable) {
        cdkBuilder.salesforce(salesforce.let(IResolvable::unwrap))
      }

      override fun salesforce(salesforce: SalesforceConnectorProfileCredentialsProperty) {
        cdkBuilder.salesforce(salesforce.let(SalesforceConnectorProfileCredentialsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8125096d4230ebacb552ce3d9537159b8a68b9464d2450bd5aa6f1facbe95b0e")
      override
          fun salesforce(salesforce: SalesforceConnectorProfileCredentialsProperty.Builder.() -> Unit):
          Unit = salesforce(SalesforceConnectorProfileCredentialsProperty(salesforce))

      override fun sapoData(sapoData: IResolvable) {
        cdkBuilder.sapoData(sapoData.let(IResolvable::unwrap))
      }

      override fun sapoData(sapoData: SAPODataConnectorProfileCredentialsProperty) {
        cdkBuilder.sapoData(sapoData.let(SAPODataConnectorProfileCredentialsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4eb8222a1406f59b6fa58b7a02bf8901be05d665f914ad45d45ac5fd045f4f4c")
      override
          fun sapoData(sapoData: SAPODataConnectorProfileCredentialsProperty.Builder.() -> Unit):
          Unit = sapoData(SAPODataConnectorProfileCredentialsProperty(sapoData))

      override fun serviceNow(serviceNow: IResolvable) {
        cdkBuilder.serviceNow(serviceNow.let(IResolvable::unwrap))
      }

      override fun serviceNow(serviceNow: ServiceNowConnectorProfileCredentialsProperty) {
        cdkBuilder.serviceNow(serviceNow.let(ServiceNowConnectorProfileCredentialsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b02952e6f6b2fe2b5336744ecbc9f91b211bac85d0f16e3b1f03a113823df128")
      override
          fun serviceNow(serviceNow: ServiceNowConnectorProfileCredentialsProperty.Builder.() -> Unit):
          Unit = serviceNow(ServiceNowConnectorProfileCredentialsProperty(serviceNow))

      override fun singular(singular: IResolvable) {
        cdkBuilder.singular(singular.let(IResolvable::unwrap))
      }

      override fun singular(singular: SingularConnectorProfileCredentialsProperty) {
        cdkBuilder.singular(singular.let(SingularConnectorProfileCredentialsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("10de7c54878920efd72a7492da089d5a5b5215db09a83d79d585211a7b854585")
      override
          fun singular(singular: SingularConnectorProfileCredentialsProperty.Builder.() -> Unit):
          Unit = singular(SingularConnectorProfileCredentialsProperty(singular))

      override fun slack(slack: IResolvable) {
        cdkBuilder.slack(slack.let(IResolvable::unwrap))
      }

      override fun slack(slack: SlackConnectorProfileCredentialsProperty) {
        cdkBuilder.slack(slack.let(SlackConnectorProfileCredentialsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e708360ff956de5ae66e5bcf479a906c70976420e0fdf09de88597ae609bcdfe")
      override fun slack(slack: SlackConnectorProfileCredentialsProperty.Builder.() -> Unit): Unit =
          slack(SlackConnectorProfileCredentialsProperty(slack))

      override fun snowflake(snowflake: IResolvable) {
        cdkBuilder.snowflake(snowflake.let(IResolvable::unwrap))
      }

      override fun snowflake(snowflake: SnowflakeConnectorProfileCredentialsProperty) {
        cdkBuilder.snowflake(snowflake.let(SnowflakeConnectorProfileCredentialsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e7966e621aa0ec164496005a82ac4e96ad8951af5b97b6b1de9a0ee9f1fe01c6")
      override
          fun snowflake(snowflake: SnowflakeConnectorProfileCredentialsProperty.Builder.() -> Unit):
          Unit = snowflake(SnowflakeConnectorProfileCredentialsProperty(snowflake))

      override fun trendmicro(trendmicro: IResolvable) {
        cdkBuilder.trendmicro(trendmicro.let(IResolvable::unwrap))
      }

      override fun trendmicro(trendmicro: TrendmicroConnectorProfileCredentialsProperty) {
        cdkBuilder.trendmicro(trendmicro.let(TrendmicroConnectorProfileCredentialsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d9e50fa6e8affa334e551d0eeb002d38e8cd5ccdd5816cd285234e481ccab15a")
      override
          fun trendmicro(trendmicro: TrendmicroConnectorProfileCredentialsProperty.Builder.() -> Unit):
          Unit = trendmicro(TrendmicroConnectorProfileCredentialsProperty(trendmicro))

      override fun veeva(veeva: IResolvable) {
        cdkBuilder.veeva(veeva.let(IResolvable::unwrap))
      }

      override fun veeva(veeva: VeevaConnectorProfileCredentialsProperty) {
        cdkBuilder.veeva(veeva.let(VeevaConnectorProfileCredentialsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9003ee28121c39c203be2c1846faf43651b82652c7c1232e5aaffd48f12ad32b")
      override fun veeva(veeva: VeevaConnectorProfileCredentialsProperty.Builder.() -> Unit): Unit =
          veeva(VeevaConnectorProfileCredentialsProperty(veeva))

      override fun zendesk(zendesk: IResolvable) {
        cdkBuilder.zendesk(zendesk.let(IResolvable::unwrap))
      }

      override fun zendesk(zendesk: ZendeskConnectorProfileCredentialsProperty) {
        cdkBuilder.zendesk(zendesk.let(ZendeskConnectorProfileCredentialsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c85e7ef3b51b61014438db51cceae114f0fd4b3e187906252b9a9db8d5fd1406")
      override fun zendesk(zendesk: ZendeskConnectorProfileCredentialsProperty.Builder.() -> Unit):
          Unit = zendesk(ZendeskConnectorProfileCredentialsProperty(zendesk))

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfileCredentialsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfileCredentialsProperty,
    ) : CdkObject(cdkObject), ConnectorProfileCredentialsProperty {
      override fun amplitude(): Any? = unwrap(this).getAmplitude()

      override fun customConnector(): Any? = unwrap(this).getCustomConnector()

      override fun datadog(): Any? = unwrap(this).getDatadog()

      override fun dynatrace(): Any? = unwrap(this).getDynatrace()

      override fun googleAnalytics(): Any? = unwrap(this).getGoogleAnalytics()

      override fun inforNexus(): Any? = unwrap(this).getInforNexus()

      override fun marketo(): Any? = unwrap(this).getMarketo()

      override fun pardot(): Any? = unwrap(this).getPardot()

      override fun redshift(): Any? = unwrap(this).getRedshift()

      override fun salesforce(): Any? = unwrap(this).getSalesforce()

      override fun sapoData(): Any? = unwrap(this).getSapoData()

      override fun serviceNow(): Any? = unwrap(this).getServiceNow()

      override fun singular(): Any? = unwrap(this).getSingular()

      override fun slack(): Any? = unwrap(this).getSlack()

      override fun snowflake(): Any? = unwrap(this).getSnowflake()

      override fun trendmicro(): Any? = unwrap(this).getTrendmicro()

      override fun veeva(): Any? = unwrap(this).getVeeva()

      override fun zendesk(): Any? = unwrap(this).getZendesk()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConnectorProfileCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfileCredentialsProperty):
          ConnectorProfileCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectorProfileCredentialsProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfileCredentialsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfileCredentialsProperty
    }
  }

  public interface ConnectorProfileConfigProperty {
    public fun connectorProfileCredentials(): Any? = unwrap(this).getConnectorProfileCredentials()

    public fun connectorProfileProperties(): Any? = unwrap(this).getConnectorProfileProperties()

    @CdkDslMarker
    public interface Builder {
      public fun connectorProfileCredentials(connectorProfileCredentials: IResolvable)

      public
          fun connectorProfileCredentials(connectorProfileCredentials: ConnectorProfileCredentialsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("78778b1f9eeaa31c36d3eb49b35214ea9780c33419d1bb5dc2578d2149bbfcbd")
      public
          fun connectorProfileCredentials(connectorProfileCredentials: ConnectorProfileCredentialsProperty.Builder.() -> Unit)

      public fun connectorProfileProperties(connectorProfileProperties: IResolvable)

      public
          fun connectorProfileProperties(connectorProfileProperties: ConnectorProfilePropertiesProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a4f9955d4fa6725ec82e5142587f8d99d8a127f0b14839c12236d96b0fc2301")
      public
          fun connectorProfileProperties(connectorProfileProperties: ConnectorProfilePropertiesProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfileConfigProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfileConfigProperty.builder()

      override fun connectorProfileCredentials(connectorProfileCredentials: IResolvable) {
        cdkBuilder.connectorProfileCredentials(connectorProfileCredentials.let(IResolvable::unwrap))
      }

      override
          fun connectorProfileCredentials(connectorProfileCredentials: ConnectorProfileCredentialsProperty) {
        cdkBuilder.connectorProfileCredentials(connectorProfileCredentials.let(ConnectorProfileCredentialsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("78778b1f9eeaa31c36d3eb49b35214ea9780c33419d1bb5dc2578d2149bbfcbd")
      override
          fun connectorProfileCredentials(connectorProfileCredentials: ConnectorProfileCredentialsProperty.Builder.() -> Unit):
          Unit =
          connectorProfileCredentials(ConnectorProfileCredentialsProperty(connectorProfileCredentials))

      override fun connectorProfileProperties(connectorProfileProperties: IResolvable) {
        cdkBuilder.connectorProfileProperties(connectorProfileProperties.let(IResolvable::unwrap))
      }

      override
          fun connectorProfileProperties(connectorProfileProperties: ConnectorProfilePropertiesProperty) {
        cdkBuilder.connectorProfileProperties(connectorProfileProperties.let(ConnectorProfilePropertiesProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a4f9955d4fa6725ec82e5142587f8d99d8a127f0b14839c12236d96b0fc2301")
      override
          fun connectorProfileProperties(connectorProfileProperties: ConnectorProfilePropertiesProperty.Builder.() -> Unit):
          Unit =
          connectorProfileProperties(ConnectorProfilePropertiesProperty(connectorProfileProperties))

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfileConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfileConfigProperty,
    ) : CdkObject(cdkObject), ConnectorProfileConfigProperty {
      override fun connectorProfileCredentials(): Any? =
          unwrap(this).getConnectorProfileCredentials()

      override fun connectorProfileProperties(): Any? = unwrap(this).getConnectorProfileProperties()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConnectorProfileConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfileConfigProperty):
          ConnectorProfileConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectorProfileConfigProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfileConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfileConfigProperty
    }
  }

  public interface CustomConnectorProfilePropertiesProperty {
    public fun oAuth2Properties(): Any? = unwrap(this).getOAuth2Properties()

    public fun profileProperties(): Any? = unwrap(this).getProfileProperties()

    @CdkDslMarker
    public interface Builder {
      public fun oAuth2Properties(oAuth2Properties: IResolvable)

      public fun oAuth2Properties(oAuth2Properties: OAuth2PropertiesProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2b19f4de65de008ed686f361f574db4fd256cbdcbd75798f4357eb0f8a2695bf")
      public fun oAuth2Properties(oAuth2Properties: OAuth2PropertiesProperty.Builder.() -> Unit)

      public fun profileProperties(profileProperties: IResolvable)

      public fun profileProperties(profileProperties: Map<String, String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.CustomConnectorProfilePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.CustomConnectorProfilePropertiesProperty.builder()

      override fun oAuth2Properties(oAuth2Properties: IResolvable) {
        cdkBuilder.oAuth2Properties(oAuth2Properties.let(IResolvable::unwrap))
      }

      override fun oAuth2Properties(oAuth2Properties: OAuth2PropertiesProperty) {
        cdkBuilder.oAuth2Properties(oAuth2Properties.let(OAuth2PropertiesProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2b19f4de65de008ed686f361f574db4fd256cbdcbd75798f4357eb0f8a2695bf")
      override fun oAuth2Properties(oAuth2Properties: OAuth2PropertiesProperty.Builder.() -> Unit):
          Unit = oAuth2Properties(OAuth2PropertiesProperty(oAuth2Properties))

      override fun profileProperties(profileProperties: IResolvable) {
        cdkBuilder.profileProperties(profileProperties.let(IResolvable::unwrap))
      }

      override fun profileProperties(profileProperties: Map<String, String>) {
        cdkBuilder.profileProperties(profileProperties)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.CustomConnectorProfilePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.CustomConnectorProfilePropertiesProperty,
    ) : CdkObject(cdkObject), CustomConnectorProfilePropertiesProperty {
      override fun oAuth2Properties(): Any? = unwrap(this).getOAuth2Properties()

      override fun profileProperties(): Any? = unwrap(this).getProfileProperties()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CustomConnectorProfilePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.CustomConnectorProfilePropertiesProperty):
          CustomConnectorProfilePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomConnectorProfilePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.CustomConnectorProfilePropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.CustomConnectorProfilePropertiesProperty
    }
  }

  public interface SnowflakeConnectorProfileCredentialsProperty {
    public fun password(): String

    public fun username(): String

    @CdkDslMarker
    public interface Builder {
      public fun password(password: String)

      public fun username(username: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SnowflakeConnectorProfileCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SnowflakeConnectorProfileCredentialsProperty.builder()

      override fun password(password: String) {
        cdkBuilder.password(password)
      }

      override fun username(username: String) {
        cdkBuilder.username(username)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SnowflakeConnectorProfileCredentialsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SnowflakeConnectorProfileCredentialsProperty,
    ) : CdkObject(cdkObject), SnowflakeConnectorProfileCredentialsProperty {
      override fun password(): String = unwrap(this).getPassword()

      override fun username(): String = unwrap(this).getUsername()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SnowflakeConnectorProfileCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.SnowflakeConnectorProfileCredentialsProperty):
          SnowflakeConnectorProfileCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SnowflakeConnectorProfileCredentialsProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SnowflakeConnectorProfileCredentialsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SnowflakeConnectorProfileCredentialsProperty
    }
  }

  public interface OAuthCredentialsProperty {
    public fun accessToken(): String? = unwrap(this).getAccessToken()

    public fun clientId(): String? = unwrap(this).getClientId()

    public fun clientSecret(): String? = unwrap(this).getClientSecret()

    public fun connectorOAuthRequest(): Any? = unwrap(this).getConnectorOAuthRequest()

    public fun refreshToken(): String? = unwrap(this).getRefreshToken()

    @CdkDslMarker
    public interface Builder {
      public fun accessToken(accessToken: String)

      public fun clientId(clientId: String)

      public fun clientSecret(clientSecret: String)

      public fun connectorOAuthRequest(connectorOAuthRequest: IResolvable)

      public fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8442f2194e283e001ea82ffc637844ff009a16f0f2c0533ea53c18d98645acd7")
      public
          fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty.Builder.() -> Unit)

      public fun refreshToken(refreshToken: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuthCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuthCredentialsProperty.builder()

      override fun accessToken(accessToken: String) {
        cdkBuilder.accessToken(accessToken)
      }

      override fun clientId(clientId: String) {
        cdkBuilder.clientId(clientId)
      }

      override fun clientSecret(clientSecret: String) {
        cdkBuilder.clientSecret(clientSecret)
      }

      override fun connectorOAuthRequest(connectorOAuthRequest: IResolvable) {
        cdkBuilder.connectorOAuthRequest(connectorOAuthRequest.let(IResolvable::unwrap))
      }

      override fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty) {
        cdkBuilder.connectorOAuthRequest(connectorOAuthRequest.let(ConnectorOAuthRequestProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8442f2194e283e001ea82ffc637844ff009a16f0f2c0533ea53c18d98645acd7")
      override
          fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty.Builder.() -> Unit):
          Unit = connectorOAuthRequest(ConnectorOAuthRequestProperty(connectorOAuthRequest))

      override fun refreshToken(refreshToken: String) {
        cdkBuilder.refreshToken(refreshToken)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuthCredentialsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuthCredentialsProperty,
    ) : CdkObject(cdkObject), OAuthCredentialsProperty {
      override fun accessToken(): String? = unwrap(this).getAccessToken()

      override fun clientId(): String? = unwrap(this).getClientId()

      override fun clientSecret(): String? = unwrap(this).getClientSecret()

      override fun connectorOAuthRequest(): Any? = unwrap(this).getConnectorOAuthRequest()

      override fun refreshToken(): String? = unwrap(this).getRefreshToken()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OAuthCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuthCredentialsProperty):
          OAuthCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OAuthCredentialsProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuthCredentialsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuthCredentialsProperty
    }
  }

  public interface ConnectorProfilePropertiesProperty {
    public fun customConnector(): Any? = unwrap(this).getCustomConnector()

    public fun datadog(): Any? = unwrap(this).getDatadog()

    public fun dynatrace(): Any? = unwrap(this).getDynatrace()

    public fun inforNexus(): Any? = unwrap(this).getInforNexus()

    public fun marketo(): Any? = unwrap(this).getMarketo()

    public fun pardot(): Any? = unwrap(this).getPardot()

    public fun redshift(): Any? = unwrap(this).getRedshift()

    public fun salesforce(): Any? = unwrap(this).getSalesforce()

    public fun sapoData(): Any? = unwrap(this).getSapoData()

    public fun serviceNow(): Any? = unwrap(this).getServiceNow()

    public fun slack(): Any? = unwrap(this).getSlack()

    public fun snowflake(): Any? = unwrap(this).getSnowflake()

    public fun veeva(): Any? = unwrap(this).getVeeva()

    public fun zendesk(): Any? = unwrap(this).getZendesk()

    @CdkDslMarker
    public interface Builder {
      public fun customConnector(customConnector: IResolvable)

      public fun customConnector(customConnector: CustomConnectorProfilePropertiesProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("83ee810629f8884c96faf678459b8f71a6aff8dc0721cfeee24e12718451451e")
      public
          fun customConnector(customConnector: CustomConnectorProfilePropertiesProperty.Builder.() -> Unit)

      public fun datadog(datadog: IResolvable)

      public fun datadog(datadog: DatadogConnectorProfilePropertiesProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c564a6fb3733938ad2bcfacebbf309873dd15a6e5d2ac56e4a61c8845a49d419")
      public fun datadog(datadog: DatadogConnectorProfilePropertiesProperty.Builder.() -> Unit)

      public fun dynatrace(dynatrace: IResolvable)

      public fun dynatrace(dynatrace: DynatraceConnectorProfilePropertiesProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e0883adb236b23111878b40eed90b7e6f96d38a81f41b484d0f296ecaa758e80")
      public
          fun dynatrace(dynatrace: DynatraceConnectorProfilePropertiesProperty.Builder.() -> Unit)

      public fun inforNexus(inforNexus: IResolvable)

      public fun inforNexus(inforNexus: InforNexusConnectorProfilePropertiesProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("051420319c8592948cadaa21137f85123ef95f0ca61745555b707071e757d0b2")
      public
          fun inforNexus(inforNexus: InforNexusConnectorProfilePropertiesProperty.Builder.() -> Unit)

      public fun marketo(marketo: IResolvable)

      public fun marketo(marketo: MarketoConnectorProfilePropertiesProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1336f043e62dbd2f2a97f99366ae7872013e4e199a6a49e3f8eaf1cd122ab697")
      public fun marketo(marketo: MarketoConnectorProfilePropertiesProperty.Builder.() -> Unit)

      public fun pardot(pardot: IResolvable)

      public fun pardot(pardot: PardotConnectorProfilePropertiesProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c65da59347459711bc397bb3dbc1ec11dae4eac674f001a943e7ebe90ab2b307")
      public fun pardot(pardot: PardotConnectorProfilePropertiesProperty.Builder.() -> Unit)

      public fun redshift(redshift: IResolvable)

      public fun redshift(redshift: RedshiftConnectorProfilePropertiesProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c13aad35344297979d923d223a184df47ac30b340e609c650481cdfe3bf619b6")
      public fun redshift(redshift: RedshiftConnectorProfilePropertiesProperty.Builder.() -> Unit)

      public fun salesforce(salesforce: IResolvable)

      public fun salesforce(salesforce: SalesforceConnectorProfilePropertiesProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f0c8bb30e7f3bbbf0e1f8d359eeb8680400ad1b9b8b063c92617b0d9a6617476")
      public
          fun salesforce(salesforce: SalesforceConnectorProfilePropertiesProperty.Builder.() -> Unit)

      public fun sapoData(sapoData: IResolvable)

      public fun sapoData(sapoData: SAPODataConnectorProfilePropertiesProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("525711f5aee270541e888570d39f5dab16dd025dfb56a4688018951e1d0f0709")
      public fun sapoData(sapoData: SAPODataConnectorProfilePropertiesProperty.Builder.() -> Unit)

      public fun serviceNow(serviceNow: IResolvable)

      public fun serviceNow(serviceNow: ServiceNowConnectorProfilePropertiesProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ccf15b390387c3eaf011d5bdf432a4803e240844a47ffa39ddb04da730293d25")
      public
          fun serviceNow(serviceNow: ServiceNowConnectorProfilePropertiesProperty.Builder.() -> Unit)

      public fun slack(slack: IResolvable)

      public fun slack(slack: SlackConnectorProfilePropertiesProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0a97573d8fe1cf050e5807ba73d78f36907be09ba79653422c392f7acd4e2e21")
      public fun slack(slack: SlackConnectorProfilePropertiesProperty.Builder.() -> Unit)

      public fun snowflake(snowflake: IResolvable)

      public fun snowflake(snowflake: SnowflakeConnectorProfilePropertiesProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("be797d1bb2569029d64440c81f0ae5c1c97e51fc93c238a0ea4b6521e1b4f907")
      public
          fun snowflake(snowflake: SnowflakeConnectorProfilePropertiesProperty.Builder.() -> Unit)

      public fun veeva(veeva: IResolvable)

      public fun veeva(veeva: VeevaConnectorProfilePropertiesProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bd5533750d9a06d562f5148d5e41ba2bdfb626ac3643765b9667b5fbf56bb147")
      public fun veeva(veeva: VeevaConnectorProfilePropertiesProperty.Builder.() -> Unit)

      public fun zendesk(zendesk: IResolvable)

      public fun zendesk(zendesk: ZendeskConnectorProfilePropertiesProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fd1044e8d4e16eceae0c81d6ec1ad2034a55fdfc8d4078d99dcf3144bb8dc9c2")
      public fun zendesk(zendesk: ZendeskConnectorProfilePropertiesProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfilePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfilePropertiesProperty.builder()

      override fun customConnector(customConnector: IResolvable) {
        cdkBuilder.customConnector(customConnector.let(IResolvable::unwrap))
      }

      override fun customConnector(customConnector: CustomConnectorProfilePropertiesProperty) {
        cdkBuilder.customConnector(customConnector.let(CustomConnectorProfilePropertiesProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("83ee810629f8884c96faf678459b8f71a6aff8dc0721cfeee24e12718451451e")
      override
          fun customConnector(customConnector: CustomConnectorProfilePropertiesProperty.Builder.() -> Unit):
          Unit = customConnector(CustomConnectorProfilePropertiesProperty(customConnector))

      override fun datadog(datadog: IResolvable) {
        cdkBuilder.datadog(datadog.let(IResolvable::unwrap))
      }

      override fun datadog(datadog: DatadogConnectorProfilePropertiesProperty) {
        cdkBuilder.datadog(datadog.let(DatadogConnectorProfilePropertiesProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c564a6fb3733938ad2bcfacebbf309873dd15a6e5d2ac56e4a61c8845a49d419")
      override fun datadog(datadog: DatadogConnectorProfilePropertiesProperty.Builder.() -> Unit):
          Unit = datadog(DatadogConnectorProfilePropertiesProperty(datadog))

      override fun dynatrace(dynatrace: IResolvable) {
        cdkBuilder.dynatrace(dynatrace.let(IResolvable::unwrap))
      }

      override fun dynatrace(dynatrace: DynatraceConnectorProfilePropertiesProperty) {
        cdkBuilder.dynatrace(dynatrace.let(DynatraceConnectorProfilePropertiesProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e0883adb236b23111878b40eed90b7e6f96d38a81f41b484d0f296ecaa758e80")
      override
          fun dynatrace(dynatrace: DynatraceConnectorProfilePropertiesProperty.Builder.() -> Unit):
          Unit = dynatrace(DynatraceConnectorProfilePropertiesProperty(dynatrace))

      override fun inforNexus(inforNexus: IResolvable) {
        cdkBuilder.inforNexus(inforNexus.let(IResolvable::unwrap))
      }

      override fun inforNexus(inforNexus: InforNexusConnectorProfilePropertiesProperty) {
        cdkBuilder.inforNexus(inforNexus.let(InforNexusConnectorProfilePropertiesProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("051420319c8592948cadaa21137f85123ef95f0ca61745555b707071e757d0b2")
      override
          fun inforNexus(inforNexus: InforNexusConnectorProfilePropertiesProperty.Builder.() -> Unit):
          Unit = inforNexus(InforNexusConnectorProfilePropertiesProperty(inforNexus))

      override fun marketo(marketo: IResolvable) {
        cdkBuilder.marketo(marketo.let(IResolvable::unwrap))
      }

      override fun marketo(marketo: MarketoConnectorProfilePropertiesProperty) {
        cdkBuilder.marketo(marketo.let(MarketoConnectorProfilePropertiesProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1336f043e62dbd2f2a97f99366ae7872013e4e199a6a49e3f8eaf1cd122ab697")
      override fun marketo(marketo: MarketoConnectorProfilePropertiesProperty.Builder.() -> Unit):
          Unit = marketo(MarketoConnectorProfilePropertiesProperty(marketo))

      override fun pardot(pardot: IResolvable) {
        cdkBuilder.pardot(pardot.let(IResolvable::unwrap))
      }

      override fun pardot(pardot: PardotConnectorProfilePropertiesProperty) {
        cdkBuilder.pardot(pardot.let(PardotConnectorProfilePropertiesProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c65da59347459711bc397bb3dbc1ec11dae4eac674f001a943e7ebe90ab2b307")
      override fun pardot(pardot: PardotConnectorProfilePropertiesProperty.Builder.() -> Unit): Unit
          = pardot(PardotConnectorProfilePropertiesProperty(pardot))

      override fun redshift(redshift: IResolvable) {
        cdkBuilder.redshift(redshift.let(IResolvable::unwrap))
      }

      override fun redshift(redshift: RedshiftConnectorProfilePropertiesProperty) {
        cdkBuilder.redshift(redshift.let(RedshiftConnectorProfilePropertiesProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c13aad35344297979d923d223a184df47ac30b340e609c650481cdfe3bf619b6")
      override
          fun redshift(redshift: RedshiftConnectorProfilePropertiesProperty.Builder.() -> Unit):
          Unit = redshift(RedshiftConnectorProfilePropertiesProperty(redshift))

      override fun salesforce(salesforce: IResolvable) {
        cdkBuilder.salesforce(salesforce.let(IResolvable::unwrap))
      }

      override fun salesforce(salesforce: SalesforceConnectorProfilePropertiesProperty) {
        cdkBuilder.salesforce(salesforce.let(SalesforceConnectorProfilePropertiesProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f0c8bb30e7f3bbbf0e1f8d359eeb8680400ad1b9b8b063c92617b0d9a6617476")
      override
          fun salesforce(salesforce: SalesforceConnectorProfilePropertiesProperty.Builder.() -> Unit):
          Unit = salesforce(SalesforceConnectorProfilePropertiesProperty(salesforce))

      override fun sapoData(sapoData: IResolvable) {
        cdkBuilder.sapoData(sapoData.let(IResolvable::unwrap))
      }

      override fun sapoData(sapoData: SAPODataConnectorProfilePropertiesProperty) {
        cdkBuilder.sapoData(sapoData.let(SAPODataConnectorProfilePropertiesProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("525711f5aee270541e888570d39f5dab16dd025dfb56a4688018951e1d0f0709")
      override
          fun sapoData(sapoData: SAPODataConnectorProfilePropertiesProperty.Builder.() -> Unit):
          Unit = sapoData(SAPODataConnectorProfilePropertiesProperty(sapoData))

      override fun serviceNow(serviceNow: IResolvable) {
        cdkBuilder.serviceNow(serviceNow.let(IResolvable::unwrap))
      }

      override fun serviceNow(serviceNow: ServiceNowConnectorProfilePropertiesProperty) {
        cdkBuilder.serviceNow(serviceNow.let(ServiceNowConnectorProfilePropertiesProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ccf15b390387c3eaf011d5bdf432a4803e240844a47ffa39ddb04da730293d25")
      override
          fun serviceNow(serviceNow: ServiceNowConnectorProfilePropertiesProperty.Builder.() -> Unit):
          Unit = serviceNow(ServiceNowConnectorProfilePropertiesProperty(serviceNow))

      override fun slack(slack: IResolvable) {
        cdkBuilder.slack(slack.let(IResolvable::unwrap))
      }

      override fun slack(slack: SlackConnectorProfilePropertiesProperty) {
        cdkBuilder.slack(slack.let(SlackConnectorProfilePropertiesProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0a97573d8fe1cf050e5807ba73d78f36907be09ba79653422c392f7acd4e2e21")
      override fun slack(slack: SlackConnectorProfilePropertiesProperty.Builder.() -> Unit): Unit =
          slack(SlackConnectorProfilePropertiesProperty(slack))

      override fun snowflake(snowflake: IResolvable) {
        cdkBuilder.snowflake(snowflake.let(IResolvable::unwrap))
      }

      override fun snowflake(snowflake: SnowflakeConnectorProfilePropertiesProperty) {
        cdkBuilder.snowflake(snowflake.let(SnowflakeConnectorProfilePropertiesProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("be797d1bb2569029d64440c81f0ae5c1c97e51fc93c238a0ea4b6521e1b4f907")
      override
          fun snowflake(snowflake: SnowflakeConnectorProfilePropertiesProperty.Builder.() -> Unit):
          Unit = snowflake(SnowflakeConnectorProfilePropertiesProperty(snowflake))

      override fun veeva(veeva: IResolvable) {
        cdkBuilder.veeva(veeva.let(IResolvable::unwrap))
      }

      override fun veeva(veeva: VeevaConnectorProfilePropertiesProperty) {
        cdkBuilder.veeva(veeva.let(VeevaConnectorProfilePropertiesProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bd5533750d9a06d562f5148d5e41ba2bdfb626ac3643765b9667b5fbf56bb147")
      override fun veeva(veeva: VeevaConnectorProfilePropertiesProperty.Builder.() -> Unit): Unit =
          veeva(VeevaConnectorProfilePropertiesProperty(veeva))

      override fun zendesk(zendesk: IResolvable) {
        cdkBuilder.zendesk(zendesk.let(IResolvable::unwrap))
      }

      override fun zendesk(zendesk: ZendeskConnectorProfilePropertiesProperty) {
        cdkBuilder.zendesk(zendesk.let(ZendeskConnectorProfilePropertiesProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fd1044e8d4e16eceae0c81d6ec1ad2034a55fdfc8d4078d99dcf3144bb8dc9c2")
      override fun zendesk(zendesk: ZendeskConnectorProfilePropertiesProperty.Builder.() -> Unit):
          Unit = zendesk(ZendeskConnectorProfilePropertiesProperty(zendesk))

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfilePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfilePropertiesProperty,
    ) : CdkObject(cdkObject), ConnectorProfilePropertiesProperty {
      override fun customConnector(): Any? = unwrap(this).getCustomConnector()

      override fun datadog(): Any? = unwrap(this).getDatadog()

      override fun dynatrace(): Any? = unwrap(this).getDynatrace()

      override fun inforNexus(): Any? = unwrap(this).getInforNexus()

      override fun marketo(): Any? = unwrap(this).getMarketo()

      override fun pardot(): Any? = unwrap(this).getPardot()

      override fun redshift(): Any? = unwrap(this).getRedshift()

      override fun salesforce(): Any? = unwrap(this).getSalesforce()

      override fun sapoData(): Any? = unwrap(this).getSapoData()

      override fun serviceNow(): Any? = unwrap(this).getServiceNow()

      override fun slack(): Any? = unwrap(this).getSlack()

      override fun snowflake(): Any? = unwrap(this).getSnowflake()

      override fun veeva(): Any? = unwrap(this).getVeeva()

      override fun zendesk(): Any? = unwrap(this).getZendesk()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConnectorProfilePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfilePropertiesProperty):
          ConnectorProfilePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectorProfilePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfilePropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfilePropertiesProperty
    }
  }

  public interface DynatraceConnectorProfilePropertiesProperty {
    public fun instanceUrl(): String

    @CdkDslMarker
    public interface Builder {
      public fun instanceUrl(instanceUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.DynatraceConnectorProfilePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.DynatraceConnectorProfilePropertiesProperty.builder()

      override fun instanceUrl(instanceUrl: String) {
        cdkBuilder.instanceUrl(instanceUrl)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.DynatraceConnectorProfilePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.DynatraceConnectorProfilePropertiesProperty,
    ) : CdkObject(cdkObject), DynatraceConnectorProfilePropertiesProperty {
      override fun instanceUrl(): String = unwrap(this).getInstanceUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DynatraceConnectorProfilePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.DynatraceConnectorProfilePropertiesProperty):
          DynatraceConnectorProfilePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DynatraceConnectorProfilePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.DynatraceConnectorProfilePropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.DynatraceConnectorProfilePropertiesProperty
    }
  }

  public interface InforNexusConnectorProfilePropertiesProperty {
    public fun instanceUrl(): String

    @CdkDslMarker
    public interface Builder {
      public fun instanceUrl(instanceUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.InforNexusConnectorProfilePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.InforNexusConnectorProfilePropertiesProperty.builder()

      override fun instanceUrl(instanceUrl: String) {
        cdkBuilder.instanceUrl(instanceUrl)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.InforNexusConnectorProfilePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.InforNexusConnectorProfilePropertiesProperty,
    ) : CdkObject(cdkObject), InforNexusConnectorProfilePropertiesProperty {
      override fun instanceUrl(): String = unwrap(this).getInstanceUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InforNexusConnectorProfilePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.InforNexusConnectorProfilePropertiesProperty):
          InforNexusConnectorProfilePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InforNexusConnectorProfilePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.InforNexusConnectorProfilePropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.InforNexusConnectorProfilePropertiesProperty
    }
  }

  public interface OAuthPropertiesProperty {
    public fun authCodeUrl(): String? = unwrap(this).getAuthCodeUrl()

    public fun oAuthScopes(): List<String> = unwrap(this).getOAuthScopes() ?: emptyList()

    public fun tokenUrl(): String? = unwrap(this).getTokenUrl()

    @CdkDslMarker
    public interface Builder {
      public fun authCodeUrl(authCodeUrl: String)

      public fun oAuthScopes(oAuthScopes: List<String>)

      public fun oAuthScopes(vararg oAuthScopes: String)

      public fun tokenUrl(tokenUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuthPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuthPropertiesProperty.builder()

      override fun authCodeUrl(authCodeUrl: String) {
        cdkBuilder.authCodeUrl(authCodeUrl)
      }

      override fun oAuthScopes(oAuthScopes: List<String>) {
        cdkBuilder.oAuthScopes(oAuthScopes)
      }

      override fun oAuthScopes(vararg oAuthScopes: String): Unit = oAuthScopes(oAuthScopes.toList())

      override fun tokenUrl(tokenUrl: String) {
        cdkBuilder.tokenUrl(tokenUrl)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuthPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuthPropertiesProperty,
    ) : CdkObject(cdkObject), OAuthPropertiesProperty {
      override fun authCodeUrl(): String? = unwrap(this).getAuthCodeUrl()

      override fun oAuthScopes(): List<String> = unwrap(this).getOAuthScopes() ?: emptyList()

      override fun tokenUrl(): String? = unwrap(this).getTokenUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OAuthPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuthPropertiesProperty):
          OAuthPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OAuthPropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuthPropertiesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuthPropertiesProperty
    }
  }

  public interface ServiceNowConnectorProfileCredentialsProperty {
    public fun oAuth2Credentials(): Any? = unwrap(this).getOAuth2Credentials()

    public fun password(): String? = unwrap(this).getPassword()

    public fun username(): String? = unwrap(this).getUsername()

    @CdkDslMarker
    public interface Builder {
      public fun oAuth2Credentials(oAuth2Credentials: IResolvable)

      public fun oAuth2Credentials(oAuth2Credentials: OAuth2CredentialsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("52363dd6c5a8eb299b5db6177cba24c77f4eff2eb58a49b48fab009df69af22f")
      public fun oAuth2Credentials(oAuth2Credentials: OAuth2CredentialsProperty.Builder.() -> Unit)

      public fun password(password: String)

      public fun username(username: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ServiceNowConnectorProfileCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ServiceNowConnectorProfileCredentialsProperty.builder()

      override fun oAuth2Credentials(oAuth2Credentials: IResolvable) {
        cdkBuilder.oAuth2Credentials(oAuth2Credentials.let(IResolvable::unwrap))
      }

      override fun oAuth2Credentials(oAuth2Credentials: OAuth2CredentialsProperty) {
        cdkBuilder.oAuth2Credentials(oAuth2Credentials.let(OAuth2CredentialsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("52363dd6c5a8eb299b5db6177cba24c77f4eff2eb58a49b48fab009df69af22f")
      override
          fun oAuth2Credentials(oAuth2Credentials: OAuth2CredentialsProperty.Builder.() -> Unit):
          Unit = oAuth2Credentials(OAuth2CredentialsProperty(oAuth2Credentials))

      override fun password(password: String) {
        cdkBuilder.password(password)
      }

      override fun username(username: String) {
        cdkBuilder.username(username)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ServiceNowConnectorProfileCredentialsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ServiceNowConnectorProfileCredentialsProperty,
    ) : CdkObject(cdkObject), ServiceNowConnectorProfileCredentialsProperty {
      override fun oAuth2Credentials(): Any? = unwrap(this).getOAuth2Credentials()

      override fun password(): String? = unwrap(this).getPassword()

      override fun username(): String? = unwrap(this).getUsername()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServiceNowConnectorProfileCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.ServiceNowConnectorProfileCredentialsProperty):
          ServiceNowConnectorProfileCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceNowConnectorProfileCredentialsProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ServiceNowConnectorProfileCredentialsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ServiceNowConnectorProfileCredentialsProperty
    }
  }

  public interface ServiceNowConnectorProfilePropertiesProperty {
    public fun instanceUrl(): String

    @CdkDslMarker
    public interface Builder {
      public fun instanceUrl(instanceUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ServiceNowConnectorProfilePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ServiceNowConnectorProfilePropertiesProperty.builder()

      override fun instanceUrl(instanceUrl: String) {
        cdkBuilder.instanceUrl(instanceUrl)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ServiceNowConnectorProfilePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ServiceNowConnectorProfilePropertiesProperty,
    ) : CdkObject(cdkObject), ServiceNowConnectorProfilePropertiesProperty {
      override fun instanceUrl(): String = unwrap(this).getInstanceUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServiceNowConnectorProfilePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.ServiceNowConnectorProfilePropertiesProperty):
          ServiceNowConnectorProfilePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceNowConnectorProfilePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ServiceNowConnectorProfilePropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ServiceNowConnectorProfilePropertiesProperty
    }
  }

  public interface PardotConnectorProfileCredentialsProperty {
    public fun accessToken(): String? = unwrap(this).getAccessToken()

    public fun clientCredentialsArn(): String? = unwrap(this).getClientCredentialsArn()

    public fun connectorOAuthRequest(): Any? = unwrap(this).getConnectorOAuthRequest()

    public fun refreshToken(): String? = unwrap(this).getRefreshToken()

    @CdkDslMarker
    public interface Builder {
      public fun accessToken(accessToken: String)

      public fun clientCredentialsArn(clientCredentialsArn: String)

      public fun connectorOAuthRequest(connectorOAuthRequest: IResolvable)

      public fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("39ab3c472f4a497ec72452bbf4eb331f225ea0fad5409ed04313e340bfb59fcb")
      public
          fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty.Builder.() -> Unit)

      public fun refreshToken(refreshToken: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.PardotConnectorProfileCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.PardotConnectorProfileCredentialsProperty.builder()

      override fun accessToken(accessToken: String) {
        cdkBuilder.accessToken(accessToken)
      }

      override fun clientCredentialsArn(clientCredentialsArn: String) {
        cdkBuilder.clientCredentialsArn(clientCredentialsArn)
      }

      override fun connectorOAuthRequest(connectorOAuthRequest: IResolvable) {
        cdkBuilder.connectorOAuthRequest(connectorOAuthRequest.let(IResolvable::unwrap))
      }

      override fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty) {
        cdkBuilder.connectorOAuthRequest(connectorOAuthRequest.let(ConnectorOAuthRequestProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("39ab3c472f4a497ec72452bbf4eb331f225ea0fad5409ed04313e340bfb59fcb")
      override
          fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty.Builder.() -> Unit):
          Unit = connectorOAuthRequest(ConnectorOAuthRequestProperty(connectorOAuthRequest))

      override fun refreshToken(refreshToken: String) {
        cdkBuilder.refreshToken(refreshToken)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.PardotConnectorProfileCredentialsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.PardotConnectorProfileCredentialsProperty,
    ) : CdkObject(cdkObject), PardotConnectorProfileCredentialsProperty {
      override fun accessToken(): String? = unwrap(this).getAccessToken()

      override fun clientCredentialsArn(): String? = unwrap(this).getClientCredentialsArn()

      override fun connectorOAuthRequest(): Any? = unwrap(this).getConnectorOAuthRequest()

      override fun refreshToken(): String? = unwrap(this).getRefreshToken()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PardotConnectorProfileCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.PardotConnectorProfileCredentialsProperty):
          PardotConnectorProfileCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PardotConnectorProfileCredentialsProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.PardotConnectorProfileCredentialsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.PardotConnectorProfileCredentialsProperty
    }
  }

  public interface DatadogConnectorProfilePropertiesProperty {
    public fun instanceUrl(): String

    @CdkDslMarker
    public interface Builder {
      public fun instanceUrl(instanceUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.DatadogConnectorProfilePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.DatadogConnectorProfilePropertiesProperty.builder()

      override fun instanceUrl(instanceUrl: String) {
        cdkBuilder.instanceUrl(instanceUrl)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.DatadogConnectorProfilePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.DatadogConnectorProfilePropertiesProperty,
    ) : CdkObject(cdkObject), DatadogConnectorProfilePropertiesProperty {
      override fun instanceUrl(): String = unwrap(this).getInstanceUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DatadogConnectorProfilePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.DatadogConnectorProfilePropertiesProperty):
          DatadogConnectorProfilePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatadogConnectorProfilePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.DatadogConnectorProfilePropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.DatadogConnectorProfilePropertiesProperty
    }
  }

  public interface ApiKeyCredentialsProperty {
    public fun apiKey(): String

    public fun apiSecretKey(): String? = unwrap(this).getApiSecretKey()

    @CdkDslMarker
    public interface Builder {
      public fun apiKey(apiKey: String)

      public fun apiSecretKey(apiSecretKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ApiKeyCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ApiKeyCredentialsProperty.builder()

      override fun apiKey(apiKey: String) {
        cdkBuilder.apiKey(apiKey)
      }

      override fun apiSecretKey(apiSecretKey: String) {
        cdkBuilder.apiSecretKey(apiSecretKey)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ApiKeyCredentialsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ApiKeyCredentialsProperty,
    ) : CdkObject(cdkObject), ApiKeyCredentialsProperty {
      override fun apiKey(): String = unwrap(this).getApiKey()

      override fun apiSecretKey(): String? = unwrap(this).getApiSecretKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ApiKeyCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.ApiKeyCredentialsProperty):
          ApiKeyCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApiKeyCredentialsProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ApiKeyCredentialsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ApiKeyCredentialsProperty
    }
  }

  public interface ZendeskConnectorProfilePropertiesProperty {
    public fun instanceUrl(): String

    @CdkDslMarker
    public interface Builder {
      public fun instanceUrl(instanceUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ZendeskConnectorProfilePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ZendeskConnectorProfilePropertiesProperty.builder()

      override fun instanceUrl(instanceUrl: String) {
        cdkBuilder.instanceUrl(instanceUrl)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ZendeskConnectorProfilePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ZendeskConnectorProfilePropertiesProperty,
    ) : CdkObject(cdkObject), ZendeskConnectorProfilePropertiesProperty {
      override fun instanceUrl(): String = unwrap(this).getInstanceUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ZendeskConnectorProfilePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.ZendeskConnectorProfilePropertiesProperty):
          ZendeskConnectorProfilePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ZendeskConnectorProfilePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ZendeskConnectorProfilePropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ZendeskConnectorProfilePropertiesProperty
    }
  }

  public interface ConnectorOAuthRequestProperty {
    public fun authCode(): String? = unwrap(this).getAuthCode()

    public fun redirectUri(): String? = unwrap(this).getRedirectUri()

    @CdkDslMarker
    public interface Builder {
      public fun authCode(authCode: String)

      public fun redirectUri(redirectUri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorOAuthRequestProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorOAuthRequestProperty.builder()

      override fun authCode(authCode: String) {
        cdkBuilder.authCode(authCode)
      }

      override fun redirectUri(redirectUri: String) {
        cdkBuilder.redirectUri(redirectUri)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorOAuthRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorOAuthRequestProperty,
    ) : CdkObject(cdkObject), ConnectorOAuthRequestProperty {
      override fun authCode(): String? = unwrap(this).getAuthCode()

      override fun redirectUri(): String? = unwrap(this).getRedirectUri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConnectorOAuthRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorOAuthRequestProperty):
          ConnectorOAuthRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectorOAuthRequestProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorOAuthRequestProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorOAuthRequestProperty
    }
  }

  public interface BasicAuthCredentialsProperty {
    public fun password(): String

    public fun username(): String

    @CdkDslMarker
    public interface Builder {
      public fun password(password: String)

      public fun username(username: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.BasicAuthCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.BasicAuthCredentialsProperty.builder()

      override fun password(password: String) {
        cdkBuilder.password(password)
      }

      override fun username(username: String) {
        cdkBuilder.username(username)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.BasicAuthCredentialsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.BasicAuthCredentialsProperty,
    ) : CdkObject(cdkObject), BasicAuthCredentialsProperty {
      override fun password(): String = unwrap(this).getPassword()

      override fun username(): String = unwrap(this).getUsername()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BasicAuthCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.BasicAuthCredentialsProperty):
          BasicAuthCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BasicAuthCredentialsProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.BasicAuthCredentialsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.BasicAuthCredentialsProperty
    }
  }

  public interface SalesforceConnectorProfilePropertiesProperty {
    public fun instanceUrl(): String? = unwrap(this).getInstanceUrl()

    public fun isSandboxEnvironment(): Any? = unwrap(this).getIsSandboxEnvironment()

    public fun usePrivateLinkForMetadataAndAuthorization(): Any? =
        unwrap(this).getUsePrivateLinkForMetadataAndAuthorization()

    @CdkDslMarker
    public interface Builder {
      public fun instanceUrl(instanceUrl: String)

      public fun isSandboxEnvironment(isSandboxEnvironment: Boolean)

      public fun isSandboxEnvironment(isSandboxEnvironment: IResolvable)

      public
          fun usePrivateLinkForMetadataAndAuthorization(usePrivateLinkForMetadataAndAuthorization: Boolean)

      public
          fun usePrivateLinkForMetadataAndAuthorization(usePrivateLinkForMetadataAndAuthorization: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SalesforceConnectorProfilePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SalesforceConnectorProfilePropertiesProperty.builder()

      override fun instanceUrl(instanceUrl: String) {
        cdkBuilder.instanceUrl(instanceUrl)
      }

      override fun isSandboxEnvironment(isSandboxEnvironment: Boolean) {
        cdkBuilder.isSandboxEnvironment(isSandboxEnvironment)
      }

      override fun isSandboxEnvironment(isSandboxEnvironment: IResolvable) {
        cdkBuilder.isSandboxEnvironment(isSandboxEnvironment.let(IResolvable::unwrap))
      }

      override
          fun usePrivateLinkForMetadataAndAuthorization(usePrivateLinkForMetadataAndAuthorization: Boolean) {
        cdkBuilder.usePrivateLinkForMetadataAndAuthorization(usePrivateLinkForMetadataAndAuthorization)
      }

      override
          fun usePrivateLinkForMetadataAndAuthorization(usePrivateLinkForMetadataAndAuthorization: IResolvable) {
        cdkBuilder.usePrivateLinkForMetadataAndAuthorization(usePrivateLinkForMetadataAndAuthorization.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SalesforceConnectorProfilePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SalesforceConnectorProfilePropertiesProperty,
    ) : CdkObject(cdkObject), SalesforceConnectorProfilePropertiesProperty {
      override fun instanceUrl(): String? = unwrap(this).getInstanceUrl()

      override fun isSandboxEnvironment(): Any? = unwrap(this).getIsSandboxEnvironment()

      override fun usePrivateLinkForMetadataAndAuthorization(): Any? =
          unwrap(this).getUsePrivateLinkForMetadataAndAuthorization()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SalesforceConnectorProfilePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.SalesforceConnectorProfilePropertiesProperty):
          SalesforceConnectorProfilePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SalesforceConnectorProfilePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SalesforceConnectorProfilePropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SalesforceConnectorProfilePropertiesProperty
    }
  }

  public interface DynatraceConnectorProfileCredentialsProperty {
    public fun apiToken(): String

    @CdkDslMarker
    public interface Builder {
      public fun apiToken(apiToken: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.DynatraceConnectorProfileCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.DynatraceConnectorProfileCredentialsProperty.builder()

      override fun apiToken(apiToken: String) {
        cdkBuilder.apiToken(apiToken)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.DynatraceConnectorProfileCredentialsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.DynatraceConnectorProfileCredentialsProperty,
    ) : CdkObject(cdkObject), DynatraceConnectorProfileCredentialsProperty {
      override fun apiToken(): String = unwrap(this).getApiToken()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DynatraceConnectorProfileCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.DynatraceConnectorProfileCredentialsProperty):
          DynatraceConnectorProfileCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DynatraceConnectorProfileCredentialsProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.DynatraceConnectorProfileCredentialsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.DynatraceConnectorProfileCredentialsProperty
    }
  }

  public interface SnowflakeConnectorProfilePropertiesProperty {
    public fun accountName(): String? = unwrap(this).getAccountName()

    public fun bucketName(): String

    public fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

    public fun privateLinkServiceName(): String? = unwrap(this).getPrivateLinkServiceName()

    public fun region(): String? = unwrap(this).getRegion()

    public fun stage(): String

    public fun warehouse(): String

    @CdkDslMarker
    public interface Builder {
      public fun accountName(accountName: String)

      public fun bucketName(bucketName: String)

      public fun bucketPrefix(bucketPrefix: String)

      public fun privateLinkServiceName(privateLinkServiceName: String)

      public fun region(region: String)

      public fun stage(stage: String)

      public fun warehouse(warehouse: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SnowflakeConnectorProfilePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SnowflakeConnectorProfilePropertiesProperty.builder()

      override fun accountName(accountName: String) {
        cdkBuilder.accountName(accountName)
      }

      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      override fun bucketPrefix(bucketPrefix: String) {
        cdkBuilder.bucketPrefix(bucketPrefix)
      }

      override fun privateLinkServiceName(privateLinkServiceName: String) {
        cdkBuilder.privateLinkServiceName(privateLinkServiceName)
      }

      override fun region(region: String) {
        cdkBuilder.region(region)
      }

      override fun stage(stage: String) {
        cdkBuilder.stage(stage)
      }

      override fun warehouse(warehouse: String) {
        cdkBuilder.warehouse(warehouse)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SnowflakeConnectorProfilePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SnowflakeConnectorProfilePropertiesProperty,
    ) : CdkObject(cdkObject), SnowflakeConnectorProfilePropertiesProperty {
      override fun accountName(): String? = unwrap(this).getAccountName()

      override fun bucketName(): String = unwrap(this).getBucketName()

      override fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

      override fun privateLinkServiceName(): String? = unwrap(this).getPrivateLinkServiceName()

      override fun region(): String? = unwrap(this).getRegion()

      override fun stage(): String = unwrap(this).getStage()

      override fun warehouse(): String = unwrap(this).getWarehouse()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SnowflakeConnectorProfilePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.SnowflakeConnectorProfilePropertiesProperty):
          SnowflakeConnectorProfilePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SnowflakeConnectorProfilePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SnowflakeConnectorProfilePropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SnowflakeConnectorProfilePropertiesProperty
    }
  }

  public interface PardotConnectorProfilePropertiesProperty {
    public fun businessUnitId(): String

    public fun instanceUrl(): String? = unwrap(this).getInstanceUrl()

    public fun isSandboxEnvironment(): Any? = unwrap(this).getIsSandboxEnvironment()

    @CdkDslMarker
    public interface Builder {
      public fun businessUnitId(businessUnitId: String)

      public fun instanceUrl(instanceUrl: String)

      public fun isSandboxEnvironment(isSandboxEnvironment: Boolean)

      public fun isSandboxEnvironment(isSandboxEnvironment: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.PardotConnectorProfilePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.PardotConnectorProfilePropertiesProperty.builder()

      override fun businessUnitId(businessUnitId: String) {
        cdkBuilder.businessUnitId(businessUnitId)
      }

      override fun instanceUrl(instanceUrl: String) {
        cdkBuilder.instanceUrl(instanceUrl)
      }

      override fun isSandboxEnvironment(isSandboxEnvironment: Boolean) {
        cdkBuilder.isSandboxEnvironment(isSandboxEnvironment)
      }

      override fun isSandboxEnvironment(isSandboxEnvironment: IResolvable) {
        cdkBuilder.isSandboxEnvironment(isSandboxEnvironment.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.PardotConnectorProfilePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.PardotConnectorProfilePropertiesProperty,
    ) : CdkObject(cdkObject), PardotConnectorProfilePropertiesProperty {
      override fun businessUnitId(): String = unwrap(this).getBusinessUnitId()

      override fun instanceUrl(): String? = unwrap(this).getInstanceUrl()

      override fun isSandboxEnvironment(): Any? = unwrap(this).getIsSandboxEnvironment()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PardotConnectorProfilePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.PardotConnectorProfilePropertiesProperty):
          PardotConnectorProfilePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PardotConnectorProfilePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.PardotConnectorProfilePropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.PardotConnectorProfilePropertiesProperty
    }
  }

  public interface MarketoConnectorProfileCredentialsProperty {
    public fun accessToken(): String? = unwrap(this).getAccessToken()

    public fun clientId(): String

    public fun clientSecret(): String

    public fun connectorOAuthRequest(): Any? = unwrap(this).getConnectorOAuthRequest()

    @CdkDslMarker
    public interface Builder {
      public fun accessToken(accessToken: String)

      public fun clientId(clientId: String)

      public fun clientSecret(clientSecret: String)

      public fun connectorOAuthRequest(connectorOAuthRequest: IResolvable)

      public fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a8bdb1e299be6f3f735fa466dee66c3a670e66cb5b936de9a655580cb9d7f106")
      public
          fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.MarketoConnectorProfileCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.MarketoConnectorProfileCredentialsProperty.builder()

      override fun accessToken(accessToken: String) {
        cdkBuilder.accessToken(accessToken)
      }

      override fun clientId(clientId: String) {
        cdkBuilder.clientId(clientId)
      }

      override fun clientSecret(clientSecret: String) {
        cdkBuilder.clientSecret(clientSecret)
      }

      override fun connectorOAuthRequest(connectorOAuthRequest: IResolvable) {
        cdkBuilder.connectorOAuthRequest(connectorOAuthRequest.let(IResolvable::unwrap))
      }

      override fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty) {
        cdkBuilder.connectorOAuthRequest(connectorOAuthRequest.let(ConnectorOAuthRequestProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a8bdb1e299be6f3f735fa466dee66c3a670e66cb5b936de9a655580cb9d7f106")
      override
          fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty.Builder.() -> Unit):
          Unit = connectorOAuthRequest(ConnectorOAuthRequestProperty(connectorOAuthRequest))

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.MarketoConnectorProfileCredentialsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.MarketoConnectorProfileCredentialsProperty,
    ) : CdkObject(cdkObject), MarketoConnectorProfileCredentialsProperty {
      override fun accessToken(): String? = unwrap(this).getAccessToken()

      override fun clientId(): String = unwrap(this).getClientId()

      override fun clientSecret(): String = unwrap(this).getClientSecret()

      override fun connectorOAuthRequest(): Any? = unwrap(this).getConnectorOAuthRequest()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MarketoConnectorProfileCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.MarketoConnectorProfileCredentialsProperty):
          MarketoConnectorProfileCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MarketoConnectorProfileCredentialsProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.MarketoConnectorProfileCredentialsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.MarketoConnectorProfileCredentialsProperty
    }
  }

  public interface VeevaConnectorProfileCredentialsProperty {
    public fun password(): String

    public fun username(): String

    @CdkDslMarker
    public interface Builder {
      public fun password(password: String)

      public fun username(username: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.VeevaConnectorProfileCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.VeevaConnectorProfileCredentialsProperty.builder()

      override fun password(password: String) {
        cdkBuilder.password(password)
      }

      override fun username(username: String) {
        cdkBuilder.username(username)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.VeevaConnectorProfileCredentialsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.VeevaConnectorProfileCredentialsProperty,
    ) : CdkObject(cdkObject), VeevaConnectorProfileCredentialsProperty {
      override fun password(): String = unwrap(this).getPassword()

      override fun username(): String = unwrap(this).getUsername()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          VeevaConnectorProfileCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.VeevaConnectorProfileCredentialsProperty):
          VeevaConnectorProfileCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VeevaConnectorProfileCredentialsProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.VeevaConnectorProfileCredentialsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.VeevaConnectorProfileCredentialsProperty
    }
  }

  public interface GoogleAnalyticsConnectorProfileCredentialsProperty {
    public fun accessToken(): String? = unwrap(this).getAccessToken()

    public fun clientId(): String

    public fun clientSecret(): String

    public fun connectorOAuthRequest(): Any? = unwrap(this).getConnectorOAuthRequest()

    public fun refreshToken(): String? = unwrap(this).getRefreshToken()

    @CdkDslMarker
    public interface Builder {
      public fun accessToken(accessToken: String)

      public fun clientId(clientId: String)

      public fun clientSecret(clientSecret: String)

      public fun connectorOAuthRequest(connectorOAuthRequest: IResolvable)

      public fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dc32999d9a74fb5605e941346909015c5109ad22c34a7eb73f8b0cdce34afd49")
      public
          fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty.Builder.() -> Unit)

      public fun refreshToken(refreshToken: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.GoogleAnalyticsConnectorProfileCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.GoogleAnalyticsConnectorProfileCredentialsProperty.builder()

      override fun accessToken(accessToken: String) {
        cdkBuilder.accessToken(accessToken)
      }

      override fun clientId(clientId: String) {
        cdkBuilder.clientId(clientId)
      }

      override fun clientSecret(clientSecret: String) {
        cdkBuilder.clientSecret(clientSecret)
      }

      override fun connectorOAuthRequest(connectorOAuthRequest: IResolvable) {
        cdkBuilder.connectorOAuthRequest(connectorOAuthRequest.let(IResolvable::unwrap))
      }

      override fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty) {
        cdkBuilder.connectorOAuthRequest(connectorOAuthRequest.let(ConnectorOAuthRequestProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dc32999d9a74fb5605e941346909015c5109ad22c34a7eb73f8b0cdce34afd49")
      override
          fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty.Builder.() -> Unit):
          Unit = connectorOAuthRequest(ConnectorOAuthRequestProperty(connectorOAuthRequest))

      override fun refreshToken(refreshToken: String) {
        cdkBuilder.refreshToken(refreshToken)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.GoogleAnalyticsConnectorProfileCredentialsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.GoogleAnalyticsConnectorProfileCredentialsProperty,
    ) : CdkObject(cdkObject), GoogleAnalyticsConnectorProfileCredentialsProperty {
      override fun accessToken(): String? = unwrap(this).getAccessToken()

      override fun clientId(): String = unwrap(this).getClientId()

      override fun clientSecret(): String = unwrap(this).getClientSecret()

      override fun connectorOAuthRequest(): Any? = unwrap(this).getConnectorOAuthRequest()

      override fun refreshToken(): String? = unwrap(this).getRefreshToken()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          GoogleAnalyticsConnectorProfileCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.GoogleAnalyticsConnectorProfileCredentialsProperty):
          GoogleAnalyticsConnectorProfileCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GoogleAnalyticsConnectorProfileCredentialsProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.GoogleAnalyticsConnectorProfileCredentialsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.GoogleAnalyticsConnectorProfileCredentialsProperty
    }
  }

  public interface SingularConnectorProfileCredentialsProperty {
    public fun apiKey(): String

    @CdkDslMarker
    public interface Builder {
      public fun apiKey(apiKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SingularConnectorProfileCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SingularConnectorProfileCredentialsProperty.builder()

      override fun apiKey(apiKey: String) {
        cdkBuilder.apiKey(apiKey)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SingularConnectorProfileCredentialsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SingularConnectorProfileCredentialsProperty,
    ) : CdkObject(cdkObject), SingularConnectorProfileCredentialsProperty {
      override fun apiKey(): String = unwrap(this).getApiKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SingularConnectorProfileCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.SingularConnectorProfileCredentialsProperty):
          SingularConnectorProfileCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SingularConnectorProfileCredentialsProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SingularConnectorProfileCredentialsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SingularConnectorProfileCredentialsProperty
    }
  }

  public interface SlackConnectorProfilePropertiesProperty {
    public fun instanceUrl(): String

    @CdkDslMarker
    public interface Builder {
      public fun instanceUrl(instanceUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SlackConnectorProfilePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SlackConnectorProfilePropertiesProperty.builder()

      override fun instanceUrl(instanceUrl: String) {
        cdkBuilder.instanceUrl(instanceUrl)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SlackConnectorProfilePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SlackConnectorProfilePropertiesProperty,
    ) : CdkObject(cdkObject), SlackConnectorProfilePropertiesProperty {
      override fun instanceUrl(): String = unwrap(this).getInstanceUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SlackConnectorProfilePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.SlackConnectorProfilePropertiesProperty):
          SlackConnectorProfilePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SlackConnectorProfilePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SlackConnectorProfilePropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SlackConnectorProfilePropertiesProperty
    }
  }

  public interface SalesforceConnectorProfileCredentialsProperty {
    public fun accessToken(): String? = unwrap(this).getAccessToken()

    public fun clientCredentialsArn(): String? = unwrap(this).getClientCredentialsArn()

    public fun connectorOAuthRequest(): Any? = unwrap(this).getConnectorOAuthRequest()

    public fun jwtToken(): String? = unwrap(this).getJwtToken()

    public fun oAuth2GrantType(): String? = unwrap(this).getOAuth2GrantType()

    public fun refreshToken(): String? = unwrap(this).getRefreshToken()

    @CdkDslMarker
    public interface Builder {
      public fun accessToken(accessToken: String)

      public fun clientCredentialsArn(clientCredentialsArn: String)

      public fun connectorOAuthRequest(connectorOAuthRequest: IResolvable)

      public fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("05b5b87a5c00f6b8e1d374bf90ffc9cf90006dc3c79379d0efacdad291a09d99")
      public
          fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty.Builder.() -> Unit)

      public fun jwtToken(jwtToken: String)

      public fun oAuth2GrantType(oAuth2GrantType: String)

      public fun refreshToken(refreshToken: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SalesforceConnectorProfileCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SalesforceConnectorProfileCredentialsProperty.builder()

      override fun accessToken(accessToken: String) {
        cdkBuilder.accessToken(accessToken)
      }

      override fun clientCredentialsArn(clientCredentialsArn: String) {
        cdkBuilder.clientCredentialsArn(clientCredentialsArn)
      }

      override fun connectorOAuthRequest(connectorOAuthRequest: IResolvable) {
        cdkBuilder.connectorOAuthRequest(connectorOAuthRequest.let(IResolvable::unwrap))
      }

      override fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty) {
        cdkBuilder.connectorOAuthRequest(connectorOAuthRequest.let(ConnectorOAuthRequestProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("05b5b87a5c00f6b8e1d374bf90ffc9cf90006dc3c79379d0efacdad291a09d99")
      override
          fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty.Builder.() -> Unit):
          Unit = connectorOAuthRequest(ConnectorOAuthRequestProperty(connectorOAuthRequest))

      override fun jwtToken(jwtToken: String) {
        cdkBuilder.jwtToken(jwtToken)
      }

      override fun oAuth2GrantType(oAuth2GrantType: String) {
        cdkBuilder.oAuth2GrantType(oAuth2GrantType)
      }

      override fun refreshToken(refreshToken: String) {
        cdkBuilder.refreshToken(refreshToken)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SalesforceConnectorProfileCredentialsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SalesforceConnectorProfileCredentialsProperty,
    ) : CdkObject(cdkObject), SalesforceConnectorProfileCredentialsProperty {
      override fun accessToken(): String? = unwrap(this).getAccessToken()

      override fun clientCredentialsArn(): String? = unwrap(this).getClientCredentialsArn()

      override fun connectorOAuthRequest(): Any? = unwrap(this).getConnectorOAuthRequest()

      override fun jwtToken(): String? = unwrap(this).getJwtToken()

      override fun oAuth2GrantType(): String? = unwrap(this).getOAuth2GrantType()

      override fun refreshToken(): String? = unwrap(this).getRefreshToken()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SalesforceConnectorProfileCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.SalesforceConnectorProfileCredentialsProperty):
          SalesforceConnectorProfileCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SalesforceConnectorProfileCredentialsProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SalesforceConnectorProfileCredentialsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SalesforceConnectorProfileCredentialsProperty
    }
  }

  public interface CustomAuthCredentialsProperty {
    public fun credentialsMap(): Any? = unwrap(this).getCredentialsMap()

    public fun customAuthenticationType(): String

    @CdkDslMarker
    public interface Builder {
      public fun credentialsMap(credentialsMap: IResolvable)

      public fun credentialsMap(credentialsMap: Map<String, String>)

      public fun customAuthenticationType(customAuthenticationType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.CustomAuthCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.CustomAuthCredentialsProperty.builder()

      override fun credentialsMap(credentialsMap: IResolvable) {
        cdkBuilder.credentialsMap(credentialsMap.let(IResolvable::unwrap))
      }

      override fun credentialsMap(credentialsMap: Map<String, String>) {
        cdkBuilder.credentialsMap(credentialsMap)
      }

      override fun customAuthenticationType(customAuthenticationType: String) {
        cdkBuilder.customAuthenticationType(customAuthenticationType)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.CustomAuthCredentialsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.CustomAuthCredentialsProperty,
    ) : CdkObject(cdkObject), CustomAuthCredentialsProperty {
      override fun credentialsMap(): Any? = unwrap(this).getCredentialsMap()

      override fun customAuthenticationType(): String = unwrap(this).getCustomAuthenticationType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomAuthCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.CustomAuthCredentialsProperty):
          CustomAuthCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomAuthCredentialsProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.CustomAuthCredentialsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.CustomAuthCredentialsProperty
    }
  }

  public interface RedshiftConnectorProfilePropertiesProperty {
    public fun bucketName(): String

    public fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

    public fun clusterIdentifier(): String? = unwrap(this).getClusterIdentifier()

    public fun dataApiRoleArn(): String? = unwrap(this).getDataApiRoleArn()

    public fun databaseName(): String? = unwrap(this).getDatabaseName()

    public fun databaseUrl(): String? = unwrap(this).getDatabaseUrl()

    public fun isRedshiftServerless(): Any? = unwrap(this).getIsRedshiftServerless()

    public fun roleArn(): String

    public fun workgroupName(): String? = unwrap(this).getWorkgroupName()

    @CdkDslMarker
    public interface Builder {
      public fun bucketName(bucketName: String)

      public fun bucketPrefix(bucketPrefix: String)

      public fun clusterIdentifier(clusterIdentifier: String)

      public fun dataApiRoleArn(dataApiRoleArn: String)

      public fun databaseName(databaseName: String)

      public fun databaseUrl(databaseUrl: String)

      public fun isRedshiftServerless(isRedshiftServerless: Boolean)

      public fun isRedshiftServerless(isRedshiftServerless: IResolvable)

      public fun roleArn(roleArn: String)

      public fun workgroupName(workgroupName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.RedshiftConnectorProfilePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.RedshiftConnectorProfilePropertiesProperty.builder()

      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      override fun bucketPrefix(bucketPrefix: String) {
        cdkBuilder.bucketPrefix(bucketPrefix)
      }

      override fun clusterIdentifier(clusterIdentifier: String) {
        cdkBuilder.clusterIdentifier(clusterIdentifier)
      }

      override fun dataApiRoleArn(dataApiRoleArn: String) {
        cdkBuilder.dataApiRoleArn(dataApiRoleArn)
      }

      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      override fun databaseUrl(databaseUrl: String) {
        cdkBuilder.databaseUrl(databaseUrl)
      }

      override fun isRedshiftServerless(isRedshiftServerless: Boolean) {
        cdkBuilder.isRedshiftServerless(isRedshiftServerless)
      }

      override fun isRedshiftServerless(isRedshiftServerless: IResolvable) {
        cdkBuilder.isRedshiftServerless(isRedshiftServerless.let(IResolvable::unwrap))
      }

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      override fun workgroupName(workgroupName: String) {
        cdkBuilder.workgroupName(workgroupName)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.RedshiftConnectorProfilePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.RedshiftConnectorProfilePropertiesProperty,
    ) : CdkObject(cdkObject), RedshiftConnectorProfilePropertiesProperty {
      override fun bucketName(): String = unwrap(this).getBucketName()

      override fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

      override fun clusterIdentifier(): String? = unwrap(this).getClusterIdentifier()

      override fun dataApiRoleArn(): String? = unwrap(this).getDataApiRoleArn()

      override fun databaseName(): String? = unwrap(this).getDatabaseName()

      override fun databaseUrl(): String? = unwrap(this).getDatabaseUrl()

      override fun isRedshiftServerless(): Any? = unwrap(this).getIsRedshiftServerless()

      override fun roleArn(): String = unwrap(this).getRoleArn()

      override fun workgroupName(): String? = unwrap(this).getWorkgroupName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RedshiftConnectorProfilePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.RedshiftConnectorProfilePropertiesProperty):
          RedshiftConnectorProfilePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RedshiftConnectorProfilePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.RedshiftConnectorProfilePropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.RedshiftConnectorProfilePropertiesProperty
    }
  }

  public interface ZendeskConnectorProfileCredentialsProperty {
    public fun accessToken(): String? = unwrap(this).getAccessToken()

    public fun clientId(): String

    public fun clientSecret(): String

    public fun connectorOAuthRequest(): Any? = unwrap(this).getConnectorOAuthRequest()

    @CdkDslMarker
    public interface Builder {
      public fun accessToken(accessToken: String)

      public fun clientId(clientId: String)

      public fun clientSecret(clientSecret: String)

      public fun connectorOAuthRequest(connectorOAuthRequest: IResolvable)

      public fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d29d020530b959b07eeaaab77bfcbc9bc73fe8d6ad3ed392f9f4f2f9f5bacb45")
      public
          fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ZendeskConnectorProfileCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ZendeskConnectorProfileCredentialsProperty.builder()

      override fun accessToken(accessToken: String) {
        cdkBuilder.accessToken(accessToken)
      }

      override fun clientId(clientId: String) {
        cdkBuilder.clientId(clientId)
      }

      override fun clientSecret(clientSecret: String) {
        cdkBuilder.clientSecret(clientSecret)
      }

      override fun connectorOAuthRequest(connectorOAuthRequest: IResolvable) {
        cdkBuilder.connectorOAuthRequest(connectorOAuthRequest.let(IResolvable::unwrap))
      }

      override fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty) {
        cdkBuilder.connectorOAuthRequest(connectorOAuthRequest.let(ConnectorOAuthRequestProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d29d020530b959b07eeaaab77bfcbc9bc73fe8d6ad3ed392f9f4f2f9f5bacb45")
      override
          fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty.Builder.() -> Unit):
          Unit = connectorOAuthRequest(ConnectorOAuthRequestProperty(connectorOAuthRequest))

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ZendeskConnectorProfileCredentialsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ZendeskConnectorProfileCredentialsProperty,
    ) : CdkObject(cdkObject), ZendeskConnectorProfileCredentialsProperty {
      override fun accessToken(): String? = unwrap(this).getAccessToken()

      override fun clientId(): String = unwrap(this).getClientId()

      override fun clientSecret(): String = unwrap(this).getClientSecret()

      override fun connectorOAuthRequest(): Any? = unwrap(this).getConnectorOAuthRequest()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ZendeskConnectorProfileCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.ZendeskConnectorProfileCredentialsProperty):
          ZendeskConnectorProfileCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ZendeskConnectorProfileCredentialsProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ZendeskConnectorProfileCredentialsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.ZendeskConnectorProfileCredentialsProperty
    }
  }

  public interface CustomConnectorProfileCredentialsProperty {
    public fun apiKey(): Any? = unwrap(this).getApiKey()

    public fun authenticationType(): String

    public fun basic(): Any? = unwrap(this).getBasic()

    public fun custom(): Any? = unwrap(this).getCustom()

    public fun oauth2(): Any? = unwrap(this).getOauth2()

    @CdkDslMarker
    public interface Builder {
      public fun apiKey(apiKey: IResolvable)

      public fun apiKey(apiKey: ApiKeyCredentialsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bda9c7ae8acca1765606651cbf1342b871184c3896a0ceba607cce3b48aa28ab")
      public fun apiKey(apiKey: ApiKeyCredentialsProperty.Builder.() -> Unit)

      public fun authenticationType(authenticationType: String)

      public fun basic(basic: IResolvable)

      public fun basic(basic: BasicAuthCredentialsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("baf9e4c4b7919bde7a4210e14a74239e0e76b1c7d17663717ad1a3e13368e7b0")
      public fun basic(basic: BasicAuthCredentialsProperty.Builder.() -> Unit)

      public fun custom(custom: IResolvable)

      public fun custom(custom: CustomAuthCredentialsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac29a2fddade456121fe054623920654f76aa806595f8c1f8601ae65913a4452")
      public fun custom(custom: CustomAuthCredentialsProperty.Builder.() -> Unit)

      public fun oauth2(oauth2: IResolvable)

      public fun oauth2(oauth2: OAuth2CredentialsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7d281424b16b15ada3366ead134f9f690373cc0331fd6365f23b2c6a26223839")
      public fun oauth2(oauth2: OAuth2CredentialsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.CustomConnectorProfileCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.CustomConnectorProfileCredentialsProperty.builder()

      override fun apiKey(apiKey: IResolvable) {
        cdkBuilder.apiKey(apiKey.let(IResolvable::unwrap))
      }

      override fun apiKey(apiKey: ApiKeyCredentialsProperty) {
        cdkBuilder.apiKey(apiKey.let(ApiKeyCredentialsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bda9c7ae8acca1765606651cbf1342b871184c3896a0ceba607cce3b48aa28ab")
      override fun apiKey(apiKey: ApiKeyCredentialsProperty.Builder.() -> Unit): Unit =
          apiKey(ApiKeyCredentialsProperty(apiKey))

      override fun authenticationType(authenticationType: String) {
        cdkBuilder.authenticationType(authenticationType)
      }

      override fun basic(basic: IResolvable) {
        cdkBuilder.basic(basic.let(IResolvable::unwrap))
      }

      override fun basic(basic: BasicAuthCredentialsProperty) {
        cdkBuilder.basic(basic.let(BasicAuthCredentialsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("baf9e4c4b7919bde7a4210e14a74239e0e76b1c7d17663717ad1a3e13368e7b0")
      override fun basic(basic: BasicAuthCredentialsProperty.Builder.() -> Unit): Unit =
          basic(BasicAuthCredentialsProperty(basic))

      override fun custom(custom: IResolvable) {
        cdkBuilder.custom(custom.let(IResolvable::unwrap))
      }

      override fun custom(custom: CustomAuthCredentialsProperty) {
        cdkBuilder.custom(custom.let(CustomAuthCredentialsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac29a2fddade456121fe054623920654f76aa806595f8c1f8601ae65913a4452")
      override fun custom(custom: CustomAuthCredentialsProperty.Builder.() -> Unit): Unit =
          custom(CustomAuthCredentialsProperty(custom))

      override fun oauth2(oauth2: IResolvable) {
        cdkBuilder.oauth2(oauth2.let(IResolvable::unwrap))
      }

      override fun oauth2(oauth2: OAuth2CredentialsProperty) {
        cdkBuilder.oauth2(oauth2.let(OAuth2CredentialsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7d281424b16b15ada3366ead134f9f690373cc0331fd6365f23b2c6a26223839")
      override fun oauth2(oauth2: OAuth2CredentialsProperty.Builder.() -> Unit): Unit =
          oauth2(OAuth2CredentialsProperty(oauth2))

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.CustomConnectorProfileCredentialsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.CustomConnectorProfileCredentialsProperty,
    ) : CdkObject(cdkObject), CustomConnectorProfileCredentialsProperty {
      override fun apiKey(): Any? = unwrap(this).getApiKey()

      override fun authenticationType(): String = unwrap(this).getAuthenticationType()

      override fun basic(): Any? = unwrap(this).getBasic()

      override fun custom(): Any? = unwrap(this).getCustom()

      override fun oauth2(): Any? = unwrap(this).getOauth2()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CustomConnectorProfileCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.CustomConnectorProfileCredentialsProperty):
          CustomConnectorProfileCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomConnectorProfileCredentialsProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.CustomConnectorProfileCredentialsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.CustomConnectorProfileCredentialsProperty
    }
  }

  public interface VeevaConnectorProfilePropertiesProperty {
    public fun instanceUrl(): String

    @CdkDslMarker
    public interface Builder {
      public fun instanceUrl(instanceUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.VeevaConnectorProfilePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.VeevaConnectorProfilePropertiesProperty.builder()

      override fun instanceUrl(instanceUrl: String) {
        cdkBuilder.instanceUrl(instanceUrl)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.VeevaConnectorProfilePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.VeevaConnectorProfilePropertiesProperty,
    ) : CdkObject(cdkObject), VeevaConnectorProfilePropertiesProperty {
      override fun instanceUrl(): String = unwrap(this).getInstanceUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          VeevaConnectorProfilePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.VeevaConnectorProfilePropertiesProperty):
          VeevaConnectorProfilePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VeevaConnectorProfilePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.VeevaConnectorProfilePropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.VeevaConnectorProfilePropertiesProperty
    }
  }

  public interface OAuth2CredentialsProperty {
    public fun accessToken(): String? = unwrap(this).getAccessToken()

    public fun clientId(): String? = unwrap(this).getClientId()

    public fun clientSecret(): String? = unwrap(this).getClientSecret()

    public fun oAuthRequest(): Any? = unwrap(this).getOAuthRequest()

    public fun refreshToken(): String? = unwrap(this).getRefreshToken()

    @CdkDslMarker
    public interface Builder {
      public fun accessToken(accessToken: String)

      public fun clientId(clientId: String)

      public fun clientSecret(clientSecret: String)

      public fun oAuthRequest(oAuthRequest: IResolvable)

      public fun oAuthRequest(oAuthRequest: ConnectorOAuthRequestProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c3eb0d875de5660f896f978d3b639a614e893c8dedd762ca9248a0f3e4b08194")
      public fun oAuthRequest(oAuthRequest: ConnectorOAuthRequestProperty.Builder.() -> Unit)

      public fun refreshToken(refreshToken: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuth2CredentialsProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuth2CredentialsProperty.builder()

      override fun accessToken(accessToken: String) {
        cdkBuilder.accessToken(accessToken)
      }

      override fun clientId(clientId: String) {
        cdkBuilder.clientId(clientId)
      }

      override fun clientSecret(clientSecret: String) {
        cdkBuilder.clientSecret(clientSecret)
      }

      override fun oAuthRequest(oAuthRequest: IResolvable) {
        cdkBuilder.oAuthRequest(oAuthRequest.let(IResolvable::unwrap))
      }

      override fun oAuthRequest(oAuthRequest: ConnectorOAuthRequestProperty) {
        cdkBuilder.oAuthRequest(oAuthRequest.let(ConnectorOAuthRequestProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c3eb0d875de5660f896f978d3b639a614e893c8dedd762ca9248a0f3e4b08194")
      override fun oAuthRequest(oAuthRequest: ConnectorOAuthRequestProperty.Builder.() -> Unit):
          Unit = oAuthRequest(ConnectorOAuthRequestProperty(oAuthRequest))

      override fun refreshToken(refreshToken: String) {
        cdkBuilder.refreshToken(refreshToken)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuth2CredentialsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuth2CredentialsProperty,
    ) : CdkObject(cdkObject), OAuth2CredentialsProperty {
      override fun accessToken(): String? = unwrap(this).getAccessToken()

      override fun clientId(): String? = unwrap(this).getClientId()

      override fun clientSecret(): String? = unwrap(this).getClientSecret()

      override fun oAuthRequest(): Any? = unwrap(this).getOAuthRequest()

      override fun refreshToken(): String? = unwrap(this).getRefreshToken()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OAuth2CredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuth2CredentialsProperty):
          OAuth2CredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OAuth2CredentialsProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuth2CredentialsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuth2CredentialsProperty
    }
  }

  public interface RedshiftConnectorProfileCredentialsProperty {
    public fun password(): String? = unwrap(this).getPassword()

    public fun username(): String? = unwrap(this).getUsername()

    @CdkDslMarker
    public interface Builder {
      public fun password(password: String)

      public fun username(username: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.RedshiftConnectorProfileCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.RedshiftConnectorProfileCredentialsProperty.builder()

      override fun password(password: String) {
        cdkBuilder.password(password)
      }

      override fun username(username: String) {
        cdkBuilder.username(username)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.RedshiftConnectorProfileCredentialsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.RedshiftConnectorProfileCredentialsProperty,
    ) : CdkObject(cdkObject), RedshiftConnectorProfileCredentialsProperty {
      override fun password(): String? = unwrap(this).getPassword()

      override fun username(): String? = unwrap(this).getUsername()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RedshiftConnectorProfileCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.RedshiftConnectorProfileCredentialsProperty):
          RedshiftConnectorProfileCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RedshiftConnectorProfileCredentialsProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.RedshiftConnectorProfileCredentialsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.RedshiftConnectorProfileCredentialsProperty
    }
  }

  public interface SAPODataConnectorProfileCredentialsProperty {
    public fun basicAuthCredentials(): Any? = unwrap(this).getBasicAuthCredentials()

    public fun oAuthCredentials(): Any? = unwrap(this).getOAuthCredentials()

    @CdkDslMarker
    public interface Builder {
      public fun basicAuthCredentials(basicAuthCredentials: IResolvable)

      public fun basicAuthCredentials(basicAuthCredentials: BasicAuthCredentialsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3f3e18012316994888207e7b5a0bf13f1b43634901a4b07b06315e9e737f1681")
      public
          fun basicAuthCredentials(basicAuthCredentials: BasicAuthCredentialsProperty.Builder.() -> Unit)

      public fun oAuthCredentials(oAuthCredentials: IResolvable)

      public fun oAuthCredentials(oAuthCredentials: OAuthCredentialsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fbc0b138a061f54950e4c81143a33d514416661bb5e7456c875ce5cadd430fa8")
      public fun oAuthCredentials(oAuthCredentials: OAuthCredentialsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SAPODataConnectorProfileCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SAPODataConnectorProfileCredentialsProperty.builder()

      override fun basicAuthCredentials(basicAuthCredentials: IResolvable) {
        cdkBuilder.basicAuthCredentials(basicAuthCredentials.let(IResolvable::unwrap))
      }

      override fun basicAuthCredentials(basicAuthCredentials: BasicAuthCredentialsProperty) {
        cdkBuilder.basicAuthCredentials(basicAuthCredentials.let(BasicAuthCredentialsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3f3e18012316994888207e7b5a0bf13f1b43634901a4b07b06315e9e737f1681")
      override
          fun basicAuthCredentials(basicAuthCredentials: BasicAuthCredentialsProperty.Builder.() -> Unit):
          Unit = basicAuthCredentials(BasicAuthCredentialsProperty(basicAuthCredentials))

      override fun oAuthCredentials(oAuthCredentials: IResolvable) {
        cdkBuilder.oAuthCredentials(oAuthCredentials.let(IResolvable::unwrap))
      }

      override fun oAuthCredentials(oAuthCredentials: OAuthCredentialsProperty) {
        cdkBuilder.oAuthCredentials(oAuthCredentials.let(OAuthCredentialsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fbc0b138a061f54950e4c81143a33d514416661bb5e7456c875ce5cadd430fa8")
      override fun oAuthCredentials(oAuthCredentials: OAuthCredentialsProperty.Builder.() -> Unit):
          Unit = oAuthCredentials(OAuthCredentialsProperty(oAuthCredentials))

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SAPODataConnectorProfileCredentialsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SAPODataConnectorProfileCredentialsProperty,
    ) : CdkObject(cdkObject), SAPODataConnectorProfileCredentialsProperty {
      override fun basicAuthCredentials(): Any? = unwrap(this).getBasicAuthCredentials()

      override fun oAuthCredentials(): Any? = unwrap(this).getOAuthCredentials()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SAPODataConnectorProfileCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.SAPODataConnectorProfileCredentialsProperty):
          SAPODataConnectorProfileCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SAPODataConnectorProfileCredentialsProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SAPODataConnectorProfileCredentialsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SAPODataConnectorProfileCredentialsProperty
    }
  }

  public interface OAuth2PropertiesProperty {
    public fun oAuth2GrantType(): String? = unwrap(this).getOAuth2GrantType()

    public fun tokenUrl(): String? = unwrap(this).getTokenUrl()

    public fun tokenUrlCustomProperties(): Any? = unwrap(this).getTokenUrlCustomProperties()

    @CdkDslMarker
    public interface Builder {
      public fun oAuth2GrantType(oAuth2GrantType: String)

      public fun tokenUrl(tokenUrl: String)

      public fun tokenUrlCustomProperties(tokenUrlCustomProperties: IResolvable)

      public fun tokenUrlCustomProperties(tokenUrlCustomProperties: Map<String, String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuth2PropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuth2PropertiesProperty.builder()

      override fun oAuth2GrantType(oAuth2GrantType: String) {
        cdkBuilder.oAuth2GrantType(oAuth2GrantType)
      }

      override fun tokenUrl(tokenUrl: String) {
        cdkBuilder.tokenUrl(tokenUrl)
      }

      override fun tokenUrlCustomProperties(tokenUrlCustomProperties: IResolvable) {
        cdkBuilder.tokenUrlCustomProperties(tokenUrlCustomProperties.let(IResolvable::unwrap))
      }

      override fun tokenUrlCustomProperties(tokenUrlCustomProperties: Map<String, String>) {
        cdkBuilder.tokenUrlCustomProperties(tokenUrlCustomProperties)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuth2PropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuth2PropertiesProperty,
    ) : CdkObject(cdkObject), OAuth2PropertiesProperty {
      override fun oAuth2GrantType(): String? = unwrap(this).getOAuth2GrantType()

      override fun tokenUrl(): String? = unwrap(this).getTokenUrl()

      override fun tokenUrlCustomProperties(): Any? = unwrap(this).getTokenUrlCustomProperties()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OAuth2PropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuth2PropertiesProperty):
          OAuth2PropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OAuth2PropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuth2PropertiesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuth2PropertiesProperty
    }
  }

  public interface SAPODataConnectorProfilePropertiesProperty {
    public fun applicationHostUrl(): String? = unwrap(this).getApplicationHostUrl()

    public fun applicationServicePath(): String? = unwrap(this).getApplicationServicePath()

    public fun clientNumber(): String? = unwrap(this).getClientNumber()

    public fun disableSso(): Any? = unwrap(this).getDisableSso()

    public fun logonLanguage(): String? = unwrap(this).getLogonLanguage()

    public fun oAuthProperties(): Any? = unwrap(this).getOAuthProperties()

    public fun portNumber(): Number? = unwrap(this).getPortNumber()

    public fun privateLinkServiceName(): String? = unwrap(this).getPrivateLinkServiceName()

    @CdkDslMarker
    public interface Builder {
      public fun applicationHostUrl(applicationHostUrl: String)

      public fun applicationServicePath(applicationServicePath: String)

      public fun clientNumber(clientNumber: String)

      public fun disableSso(disableSso: Boolean)

      public fun disableSso(disableSso: IResolvable)

      public fun logonLanguage(logonLanguage: String)

      public fun oAuthProperties(oAuthProperties: IResolvable)

      public fun oAuthProperties(oAuthProperties: OAuthPropertiesProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("234337966d9cc333f43582bd408bf7f62af955ea3e1b8cb2d39e12371af762ed")
      public fun oAuthProperties(oAuthProperties: OAuthPropertiesProperty.Builder.() -> Unit)

      public fun portNumber(portNumber: Number)

      public fun privateLinkServiceName(privateLinkServiceName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SAPODataConnectorProfilePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SAPODataConnectorProfilePropertiesProperty.builder()

      override fun applicationHostUrl(applicationHostUrl: String) {
        cdkBuilder.applicationHostUrl(applicationHostUrl)
      }

      override fun applicationServicePath(applicationServicePath: String) {
        cdkBuilder.applicationServicePath(applicationServicePath)
      }

      override fun clientNumber(clientNumber: String) {
        cdkBuilder.clientNumber(clientNumber)
      }

      override fun disableSso(disableSso: Boolean) {
        cdkBuilder.disableSso(disableSso)
      }

      override fun disableSso(disableSso: IResolvable) {
        cdkBuilder.disableSso(disableSso.let(IResolvable::unwrap))
      }

      override fun logonLanguage(logonLanguage: String) {
        cdkBuilder.logonLanguage(logonLanguage)
      }

      override fun oAuthProperties(oAuthProperties: IResolvable) {
        cdkBuilder.oAuthProperties(oAuthProperties.let(IResolvable::unwrap))
      }

      override fun oAuthProperties(oAuthProperties: OAuthPropertiesProperty) {
        cdkBuilder.oAuthProperties(oAuthProperties.let(OAuthPropertiesProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("234337966d9cc333f43582bd408bf7f62af955ea3e1b8cb2d39e12371af762ed")
      override fun oAuthProperties(oAuthProperties: OAuthPropertiesProperty.Builder.() -> Unit):
          Unit = oAuthProperties(OAuthPropertiesProperty(oAuthProperties))

      override fun portNumber(portNumber: Number) {
        cdkBuilder.portNumber(portNumber)
      }

      override fun privateLinkServiceName(privateLinkServiceName: String) {
        cdkBuilder.privateLinkServiceName(privateLinkServiceName)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SAPODataConnectorProfilePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SAPODataConnectorProfilePropertiesProperty,
    ) : CdkObject(cdkObject), SAPODataConnectorProfilePropertiesProperty {
      override fun applicationHostUrl(): String? = unwrap(this).getApplicationHostUrl()

      override fun applicationServicePath(): String? = unwrap(this).getApplicationServicePath()

      override fun clientNumber(): String? = unwrap(this).getClientNumber()

      override fun disableSso(): Any? = unwrap(this).getDisableSso()

      override fun logonLanguage(): String? = unwrap(this).getLogonLanguage()

      override fun oAuthProperties(): Any? = unwrap(this).getOAuthProperties()

      override fun portNumber(): Number? = unwrap(this).getPortNumber()

      override fun privateLinkServiceName(): String? = unwrap(this).getPrivateLinkServiceName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SAPODataConnectorProfilePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.SAPODataConnectorProfilePropertiesProperty):
          SAPODataConnectorProfilePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SAPODataConnectorProfilePropertiesProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SAPODataConnectorProfilePropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SAPODataConnectorProfilePropertiesProperty
    }
  }

  public interface InforNexusConnectorProfileCredentialsProperty {
    public fun accessKeyId(): String

    public fun datakey(): String

    public fun secretAccessKey(): String

    public fun userId(): String

    @CdkDslMarker
    public interface Builder {
      public fun accessKeyId(accessKeyId: String)

      public fun datakey(datakey: String)

      public fun secretAccessKey(secretAccessKey: String)

      public fun userId(userId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.InforNexusConnectorProfileCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.InforNexusConnectorProfileCredentialsProperty.builder()

      override fun accessKeyId(accessKeyId: String) {
        cdkBuilder.accessKeyId(accessKeyId)
      }

      override fun datakey(datakey: String) {
        cdkBuilder.datakey(datakey)
      }

      override fun secretAccessKey(secretAccessKey: String) {
        cdkBuilder.secretAccessKey(secretAccessKey)
      }

      override fun userId(userId: String) {
        cdkBuilder.userId(userId)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.InforNexusConnectorProfileCredentialsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.InforNexusConnectorProfileCredentialsProperty,
    ) : CdkObject(cdkObject), InforNexusConnectorProfileCredentialsProperty {
      override fun accessKeyId(): String = unwrap(this).getAccessKeyId()

      override fun datakey(): String = unwrap(this).getDatakey()

      override fun secretAccessKey(): String = unwrap(this).getSecretAccessKey()

      override fun userId(): String = unwrap(this).getUserId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InforNexusConnectorProfileCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.InforNexusConnectorProfileCredentialsProperty):
          InforNexusConnectorProfileCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InforNexusConnectorProfileCredentialsProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.InforNexusConnectorProfileCredentialsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.InforNexusConnectorProfileCredentialsProperty
    }
  }

  public interface TrendmicroConnectorProfileCredentialsProperty {
    public fun apiSecretKey(): String

    @CdkDslMarker
    public interface Builder {
      public fun apiSecretKey(apiSecretKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.TrendmicroConnectorProfileCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.TrendmicroConnectorProfileCredentialsProperty.builder()

      override fun apiSecretKey(apiSecretKey: String) {
        cdkBuilder.apiSecretKey(apiSecretKey)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.TrendmicroConnectorProfileCredentialsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.TrendmicroConnectorProfileCredentialsProperty,
    ) : CdkObject(cdkObject), TrendmicroConnectorProfileCredentialsProperty {
      override fun apiSecretKey(): String = unwrap(this).getApiSecretKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          TrendmicroConnectorProfileCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.TrendmicroConnectorProfileCredentialsProperty):
          TrendmicroConnectorProfileCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TrendmicroConnectorProfileCredentialsProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.TrendmicroConnectorProfileCredentialsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.TrendmicroConnectorProfileCredentialsProperty
    }
  }

  public interface SlackConnectorProfileCredentialsProperty {
    public fun accessToken(): String? = unwrap(this).getAccessToken()

    public fun clientId(): String

    public fun clientSecret(): String

    public fun connectorOAuthRequest(): Any? = unwrap(this).getConnectorOAuthRequest()

    @CdkDslMarker
    public interface Builder {
      public fun accessToken(accessToken: String)

      public fun clientId(clientId: String)

      public fun clientSecret(clientSecret: String)

      public fun connectorOAuthRequest(connectorOAuthRequest: IResolvable)

      public fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a269a2424052e57448352507b00d903028640821e3a9216e4706a214f40ace47")
      public
          fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SlackConnectorProfileCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SlackConnectorProfileCredentialsProperty.builder()

      override fun accessToken(accessToken: String) {
        cdkBuilder.accessToken(accessToken)
      }

      override fun clientId(clientId: String) {
        cdkBuilder.clientId(clientId)
      }

      override fun clientSecret(clientSecret: String) {
        cdkBuilder.clientSecret(clientSecret)
      }

      override fun connectorOAuthRequest(connectorOAuthRequest: IResolvable) {
        cdkBuilder.connectorOAuthRequest(connectorOAuthRequest.let(IResolvable::unwrap))
      }

      override fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty) {
        cdkBuilder.connectorOAuthRequest(connectorOAuthRequest.let(ConnectorOAuthRequestProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a269a2424052e57448352507b00d903028640821e3a9216e4706a214f40ace47")
      override
          fun connectorOAuthRequest(connectorOAuthRequest: ConnectorOAuthRequestProperty.Builder.() -> Unit):
          Unit = connectorOAuthRequest(ConnectorOAuthRequestProperty(connectorOAuthRequest))

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SlackConnectorProfileCredentialsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SlackConnectorProfileCredentialsProperty,
    ) : CdkObject(cdkObject), SlackConnectorProfileCredentialsProperty {
      override fun accessToken(): String? = unwrap(this).getAccessToken()

      override fun clientId(): String = unwrap(this).getClientId()

      override fun clientSecret(): String = unwrap(this).getClientSecret()

      override fun connectorOAuthRequest(): Any? = unwrap(this).getConnectorOAuthRequest()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SlackConnectorProfileCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.SlackConnectorProfileCredentialsProperty):
          SlackConnectorProfileCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SlackConnectorProfileCredentialsProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SlackConnectorProfileCredentialsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.SlackConnectorProfileCredentialsProperty
    }
  }

  public interface DatadogConnectorProfileCredentialsProperty {
    public fun apiKey(): String

    public fun applicationKey(): String

    @CdkDslMarker
    public interface Builder {
      public fun apiKey(apiKey: String)

      public fun applicationKey(applicationKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.DatadogConnectorProfileCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.DatadogConnectorProfileCredentialsProperty.builder()

      override fun apiKey(apiKey: String) {
        cdkBuilder.apiKey(apiKey)
      }

      override fun applicationKey(applicationKey: String) {
        cdkBuilder.applicationKey(applicationKey)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.DatadogConnectorProfileCredentialsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.DatadogConnectorProfileCredentialsProperty,
    ) : CdkObject(cdkObject), DatadogConnectorProfileCredentialsProperty {
      override fun apiKey(): String = unwrap(this).getApiKey()

      override fun applicationKey(): String = unwrap(this).getApplicationKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DatadogConnectorProfileCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.DatadogConnectorProfileCredentialsProperty):
          DatadogConnectorProfileCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatadogConnectorProfileCredentialsProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.DatadogConnectorProfileCredentialsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.DatadogConnectorProfileCredentialsProperty
    }
  }

  public interface AmplitudeConnectorProfileCredentialsProperty {
    public fun apiKey(): String

    public fun secretKey(): String

    @CdkDslMarker
    public interface Builder {
      public fun apiKey(apiKey: String)

      public fun secretKey(secretKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.AmplitudeConnectorProfileCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.AmplitudeConnectorProfileCredentialsProperty.builder()

      override fun apiKey(apiKey: String) {
        cdkBuilder.apiKey(apiKey)
      }

      override fun secretKey(secretKey: String) {
        cdkBuilder.secretKey(secretKey)
      }

      public fun build():
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.AmplitudeConnectorProfileCredentialsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.AmplitudeConnectorProfileCredentialsProperty,
    ) : CdkObject(cdkObject), AmplitudeConnectorProfileCredentialsProperty {
      override fun apiKey(): String = unwrap(this).getApiKey()

      override fun secretKey(): String = unwrap(this).getSecretKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AmplitudeConnectorProfileCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appflow.CfnConnectorProfile.AmplitudeConnectorProfileCredentialsProperty):
          AmplitudeConnectorProfileCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AmplitudeConnectorProfileCredentialsProperty):
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.AmplitudeConnectorProfileCredentialsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appflow.CfnConnectorProfile.AmplitudeConnectorProfileCredentialsProperty
    }
  }
}