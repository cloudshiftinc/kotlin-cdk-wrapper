@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource

/**
 * Provides the configuration information required for Amazon Kendra Web Crawler.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendra.*;
 * WebCrawlerConfigurationProperty webCrawlerConfigurationProperty =
 * WebCrawlerConfigurationProperty.builder()
 * .urls(WebCrawlerUrlsProperty.builder()
 * .seedUrlConfiguration(WebCrawlerSeedUrlConfigurationProperty.builder()
 * .seedUrls(List.of("seedUrls"))
 * // the properties below are optional
 * .webCrawlerMode("webCrawlerMode")
 * .build())
 * .siteMapsConfiguration(WebCrawlerSiteMapsConfigurationProperty.builder()
 * .siteMaps(List.of("siteMaps"))
 * .build())
 * .build())
 * // the properties below are optional
 * .authenticationConfiguration(WebCrawlerAuthenticationConfigurationProperty.builder()
 * .basicAuthentication(List.of(WebCrawlerBasicAuthenticationProperty.builder()
 * .credentials("credentials")
 * .host("host")
 * .port(123)
 * .build()))
 * .build())
 * .crawlDepth(123)
 * .maxContentSizePerPageInMegaBytes(123)
 * .maxLinksPerPage(123)
 * .maxUrlsPerMinuteCrawlRate(123)
 * .proxyConfiguration(ProxyConfigurationProperty.builder()
 * .host("host")
 * .port(123)
 * // the properties below are optional
 * .credentials("credentials")
 * .build())
 * .urlExclusionPatterns(List.of("urlExclusionPatterns"))
 * .urlInclusionPatterns(List.of("urlInclusionPatterns"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-webcrawlerconfiguration.html)
 */
@CdkDslMarker
public class CfnDataSourceWebCrawlerConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataSource.WebCrawlerConfigurationProperty.Builder =
        CfnDataSource.WebCrawlerConfigurationProperty.builder()

    private val _urlExclusionPatterns: MutableList<String> = mutableListOf()

    private val _urlInclusionPatterns: MutableList<String> = mutableListOf()

    /**
     * @param authenticationConfiguration Configuration information required to connect to websites
     *   using authentication. You can connect to websites using basic authentication of user name
     *   and password. You use a secret in
     *   [AWS Secrets Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html)
     *   to store your authentication credentials.
     *
     * You must provide the website host name and port number. For example, the host name of
     * https://a.example.com/page1.html is "a.example.com" and the port is 443, the standard port
     * for HTTPS.
     */
    public fun authenticationConfiguration(authenticationConfiguration: IResolvable) {
        cdkBuilder.authenticationConfiguration(authenticationConfiguration)
    }

    /**
     * @param authenticationConfiguration Configuration information required to connect to websites
     *   using authentication. You can connect to websites using basic authentication of user name
     *   and password. You use a secret in
     *   [AWS Secrets Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html)
     *   to store your authentication credentials.
     *
     * You must provide the website host name and port number. For example, the host name of
     * https://a.example.com/page1.html is "a.example.com" and the port is 443, the standard port
     * for HTTPS.
     */
    public fun authenticationConfiguration(
        authenticationConfiguration: CfnDataSource.WebCrawlerAuthenticationConfigurationProperty
    ) {
        cdkBuilder.authenticationConfiguration(authenticationConfiguration)
    }

    /**
     * @param crawlDepth The 'depth' or number of levels from the seed level to crawl. For example,
     *   the seed URL page is depth 1 and any hyperlinks on this page that are also crawled are
     *   depth 2.
     */
    public fun crawlDepth(crawlDepth: Number) {
        cdkBuilder.crawlDepth(crawlDepth)
    }

    /**
     * @param maxContentSizePerPageInMegaBytes The maximum size (in MB) of a web page or attachment
     *   to crawl. Files larger than this size (in MB) are skipped/not crawled.
     *
     * The default maximum size of a web page or attachment is set to 50 MB.
     */
    public fun maxContentSizePerPageInMegaBytes(maxContentSizePerPageInMegaBytes: Number) {
        cdkBuilder.maxContentSizePerPageInMegaBytes(maxContentSizePerPageInMegaBytes)
    }

    /**
     * @param maxLinksPerPage The maximum number of URLs on a web page to include when crawling a
     *   website. This number is per web page.
     *
     * As a website’s web pages are crawled, any URLs the web pages link to are also crawled. URLs
     * on a web page are crawled in order of appearance.
     *
     * The default maximum links per page is 100.
     */
    public fun maxLinksPerPage(maxLinksPerPage: Number) {
        cdkBuilder.maxLinksPerPage(maxLinksPerPage)
    }

    /**
     * @param maxUrlsPerMinuteCrawlRate The maximum number of URLs crawled per website host per
     *   minute. A minimum of one URL is required.
     *
     * The default maximum number of URLs crawled per website host per minute is 300.
     */
    public fun maxUrlsPerMinuteCrawlRate(maxUrlsPerMinuteCrawlRate: Number) {
        cdkBuilder.maxUrlsPerMinuteCrawlRate(maxUrlsPerMinuteCrawlRate)
    }

    /**
     * @param proxyConfiguration Configuration information required to connect to your internal
     *   websites via a web proxy. You must provide the website host name and port number. For
     *   example, the host name of https://a.example.com/page1.html is "a.example.com" and the port
     *   is 443, the standard port for HTTPS.
     *
     * Web proxy credentials are optional and you can use them to connect to a web proxy server that
     * requires basic authentication. To store web proxy credentials, you use a secret in
     * [AWS Secrets Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html)
     * .
     */
    public fun proxyConfiguration(proxyConfiguration: IResolvable) {
        cdkBuilder.proxyConfiguration(proxyConfiguration)
    }

    /**
     * @param proxyConfiguration Configuration information required to connect to your internal
     *   websites via a web proxy. You must provide the website host name and port number. For
     *   example, the host name of https://a.example.com/page1.html is "a.example.com" and the port
     *   is 443, the standard port for HTTPS.
     *
     * Web proxy credentials are optional and you can use them to connect to a web proxy server that
     * requires basic authentication. To store web proxy credentials, you use a secret in
     * [AWS Secrets Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html)
     * .
     */
    public fun proxyConfiguration(proxyConfiguration: CfnDataSource.ProxyConfigurationProperty) {
        cdkBuilder.proxyConfiguration(proxyConfiguration)
    }

    /**
     * @param urlExclusionPatterns A list of regular expression patterns to exclude certain URLs to
     *   crawl. URLs that match the patterns are excluded from the index. URLs that don't match the
     *   patterns are included in the index. If a URL matches both an inclusion and exclusion
     *   pattern, the exclusion pattern takes precedence and the URL file isn't included in the
     *   index.
     */
    public fun urlExclusionPatterns(vararg urlExclusionPatterns: String) {
        _urlExclusionPatterns.addAll(listOf(*urlExclusionPatterns))
    }

    /**
     * @param urlExclusionPatterns A list of regular expression patterns to exclude certain URLs to
     *   crawl. URLs that match the patterns are excluded from the index. URLs that don't match the
     *   patterns are included in the index. If a URL matches both an inclusion and exclusion
     *   pattern, the exclusion pattern takes precedence and the URL file isn't included in the
     *   index.
     */
    public fun urlExclusionPatterns(urlExclusionPatterns: Collection<String>) {
        _urlExclusionPatterns.addAll(urlExclusionPatterns)
    }

    /**
     * @param urlInclusionPatterns A list of regular expression patterns to include certain URLs to
     *   crawl. URLs that match the patterns are included in the index. URLs that don't match the
     *   patterns are excluded from the index. If a URL matches both an inclusion and exclusion
     *   pattern, the exclusion pattern takes precedence and the URL file isn't included in the
     *   index.
     */
    public fun urlInclusionPatterns(vararg urlInclusionPatterns: String) {
        _urlInclusionPatterns.addAll(listOf(*urlInclusionPatterns))
    }

    /**
     * @param urlInclusionPatterns A list of regular expression patterns to include certain URLs to
     *   crawl. URLs that match the patterns are included in the index. URLs that don't match the
     *   patterns are excluded from the index. If a URL matches both an inclusion and exclusion
     *   pattern, the exclusion pattern takes precedence and the URL file isn't included in the
     *   index.
     */
    public fun urlInclusionPatterns(urlInclusionPatterns: Collection<String>) {
        _urlInclusionPatterns.addAll(urlInclusionPatterns)
    }

    /**
     * @param urls Specifies the seed or starting point URLs of the websites or the sitemap URLs of
     *   the websites you want to crawl. You can include website subdomains. You can list up to 100
     *   seed URLs and up to three sitemap URLs.
     *
     * You can only crawl websites that use the secure communication protocol, Hypertext Transfer
     * Protocol Secure (HTTPS). If you receive an error when crawling a website, it could be that
     * the website is blocked from crawling.
     *
     * *When selecting websites to index, you must adhere to the
     * [Amazon Acceptable Use Policy](https://docs.aws.amazon.com/aup/) and all other Amazon terms.
     * Remember that you must only use Amazon Kendra Web Crawler to index your own webpages, or
     * webpages that you have authorization to index.*
     */
    public fun urls(urls: IResolvable) {
        cdkBuilder.urls(urls)
    }

    /**
     * @param urls Specifies the seed or starting point URLs of the websites or the sitemap URLs of
     *   the websites you want to crawl. You can include website subdomains. You can list up to 100
     *   seed URLs and up to three sitemap URLs.
     *
     * You can only crawl websites that use the secure communication protocol, Hypertext Transfer
     * Protocol Secure (HTTPS). If you receive an error when crawling a website, it could be that
     * the website is blocked from crawling.
     *
     * *When selecting websites to index, you must adhere to the
     * [Amazon Acceptable Use Policy](https://docs.aws.amazon.com/aup/) and all other Amazon terms.
     * Remember that you must only use Amazon Kendra Web Crawler to index your own webpages, or
     * webpages that you have authorization to index.*
     */
    public fun urls(urls: CfnDataSource.WebCrawlerUrlsProperty) {
        cdkBuilder.urls(urls)
    }

    public fun build(): CfnDataSource.WebCrawlerConfigurationProperty {
        if (_urlExclusionPatterns.isNotEmpty())
            cdkBuilder.urlExclusionPatterns(_urlExclusionPatterns)
        if (_urlInclusionPatterns.isNotEmpty())
            cdkBuilder.urlInclusionPatterns(_urlInclusionPatterns)
        return cdkBuilder.build()
    }
}
